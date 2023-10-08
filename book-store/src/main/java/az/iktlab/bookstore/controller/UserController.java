package az.iktlab.bookstore.controller;

import az.iktlab.bookstore.model.dto.request.SignUpRequestDTO;
import az.iktlab.bookstore.model.entity.User;
import az.iktlab.bookstore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/users")
public class UserController {

    private final UserService userService;


    @PostMapping
    public boolean addUser(@RequestBody @Valid SignUpRequestDTO signUpRequestDTO){
        return userService.addUser(signUpRequestDTO);
    }

    @GetMapping
    public List<User> getAllUsers(@RequestParam(defaultValue = "0") int page,
                                        @RequestParam(defaultValue = "2") int size){
        return userService.getAllUsers(page,size);
    }
}
