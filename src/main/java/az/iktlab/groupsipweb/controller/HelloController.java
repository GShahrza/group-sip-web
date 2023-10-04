package az.iktlab.groupsipweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @PostMapping("/test")
    public void test() {
        System.out.println("Test method in Hello controller class");
    }

    @GetMapping("/say")
    public String getHello() {
        return "<h1>Hello Spring</h1>";
    }
}
