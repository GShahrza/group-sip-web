package az.iktlab.bookstore.service.impl;

import az.iktlab.bookstore.exception.UserNotFoundException;
import az.iktlab.bookstore.model.dto.request.SignUpRequestDTO;
import az.iktlab.bookstore.model.dto.request.UserRequestDTO;
import az.iktlab.bookstore.model.dto.response.UserResponseDTO;
import az.iktlab.bookstore.model.entity.Account;
import az.iktlab.bookstore.model.entity.User;
import az.iktlab.bookstore.model.mapper.UserMapper;
import az.iktlab.bookstore.repository.UserRepository;
import az.iktlab.bookstore.service.AccountService;
import az.iktlab.bookstore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final AccountService accountService;

    private final UserMapper userMapper;

    public List<UserResponseDTO> getAllUsers(int page, int size) {
        Pageable paging = PageRequest.of(page, size);
        return userRepository.findAll(paging).getContent().stream()
                .map(userMapper::userToUserResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserResponseDTO getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() ->new UserNotFoundException("user not found"));
        UserResponseDTO userResponseDTO = userMapper.userToUserResponseDTO(user);
        return userResponseDTO;
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public boolean updateUser(Long id, UserRequestDTO userRequestDTO) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setFirstName(userRequestDTO.getFirstName());
        user.setLastName(userRequestDTO.getLastName());
        user.setContactNumber(userRequestDTO.getContactNumber());

        userRepository.save(user);
        return true;
    }

    @Override
    public boolean deleteUser(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("message"));
        userRepository.delete(user);
        return true;
    }

    @Override
    public boolean addRoleToUser(Long id, String roleName) {
        return false;
    }

    @Override
    public boolean deleteRoleFromUser(Long id, String roleName) {
        return false;
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public boolean addUser(SignUpRequestDTO signUpRequestDTO) {
        Account account = accountService.add(signUpRequestDTO);

        User user = userMapper.signUpRequestDTOtoUser(signUpRequestDTO);
        user.setAccount(account);
        userRepository.save(user);

        return true;
    }
}
