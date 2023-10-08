package az.iktlab.bookstore.service;

import az.iktlab.bookstore.model.dto.request.SignUpRequestDTO;
import az.iktlab.bookstore.model.entity.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {

    boolean addUser(SignUpRequestDTO signUpRequestDTO);

    List<User> getAllUsers(int page, int size);
}
