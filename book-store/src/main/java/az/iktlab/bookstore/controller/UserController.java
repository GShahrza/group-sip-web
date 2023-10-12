package az.iktlab.bookstore.controller;

import az.iktlab.bookstore.model.dto.request.SignUpRequestDTO;
import az.iktlab.bookstore.model.dto.request.UserRequestDTO;
import az.iktlab.bookstore.model.dto.response.UserResponseDTO;
import az.iktlab.bookstore.model.entity.User;
import az.iktlab.bookstore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public boolean addUser(@Valid @RequestBody SignUpRequestDTO signUpRequestDTO) {
        return userService.addUser(signUpRequestDTO);
    }

    @GetMapping
    public List<User> getAllUsers(@RequestParam(defaultValue = "0") int page,
                                  @RequestParam(defaultValue = "2") int size) {
        return userService.getAllUsers(page, size);
    }

    @GetMapping("/{id}")
    public UserResponseDTO getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/username")
    public User getUserByUsername(@RequestParam String username) {
        return userService.getUserByUsername(username);
    }

    @PostMapping("/{id}")
    public boolean updateUser(@PathVariable Long id,
                              @Valid @RequestBody UserRequestDTO userRequestDTO) {
        return userService.updateUser(id, userRequestDTO);
    }

    @DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

    @PatchMapping("/{id}/add-role")
    public boolean addRoleToUser(@PathVariable Long id,
                                 @RequestParam String roleName) {
        return userService.addRoleToUser(id, roleName);
    }

    @PatchMapping("/{id}/delete-role")
    public boolean deleteRoleFromUser(@PathVariable Long id,
                                      @RequestParam String roleName) {
        return userService.deleteRoleFromUser(id, roleName);
    }
}
