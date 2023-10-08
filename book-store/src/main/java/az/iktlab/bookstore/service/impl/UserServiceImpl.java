package az.iktlab.bookstore.service.impl;

import az.iktlab.bookstore.model.dto.request.SignUpRequestDTO;
import az.iktlab.bookstore.model.entity.Account;
import az.iktlab.bookstore.model.entity.User;
import az.iktlab.bookstore.repository.UserRepository;
import az.iktlab.bookstore.service.AccountService;
import az.iktlab.bookstore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final AccountService accountService;


    public List<User> getAllUsers(int page, int size){
        Pageable paging = PageRequest.of(page, size);
        List<User> users = userRepository.findAll(paging).getContent();
        return users;
    }

    @Override
    public boolean addUser(SignUpRequestDTO signUpRequestDTO) {
        Account account = accountService.add(signUpRequestDTO);

        User user = User.builder()
                .firstName(signUpRequestDTO.getFirstName())
                .lastName(signUpRequestDTO.getLastName())
                .contactNumber(signUpRequestDTO.getContactNumber())
                .email(signUpRequestDTO.getEmail())
                .account(account)
                .build();
         userRepository.save(user);

         return true;
    }
}
