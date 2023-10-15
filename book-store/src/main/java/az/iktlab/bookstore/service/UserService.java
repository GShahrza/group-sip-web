package az.iktlab.bookstore.service;

import az.iktlab.bookstore.model.dto.request.SignUpRequestDTO;
import az.iktlab.bookstore.model.dto.request.UserRequestDTO;
import az.iktlab.bookstore.model.dto.response.UserResponseDTO;
import az.iktlab.bookstore.model.entity.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {

    boolean addUser(SignUpRequestDTO signUpRequestDTO);

    List<UserResponseDTO> getAllUsers(int page, int size);

    UserResponseDTO getUserById(Long id);

    User getUserByUsername(String username);

    boolean updateUser(Long id, UserRequestDTO userRequestDTO);

    boolean deleteUser(Long id);

    boolean addRoleToUser(Long id, String roleName);

    boolean deleteRoleFromUser(Long id, String roleName);
}
