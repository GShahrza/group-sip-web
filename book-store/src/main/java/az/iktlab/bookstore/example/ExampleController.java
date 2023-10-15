package az.iktlab.bookstore.example;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/example")
public class ExampleController {

    private final UserFeignClient userFeignClient;

    @GetMapping("{id}")
    public User getUser(@PathVariable Long id){
       return userFeignClient.getUser(id);
    }
}
