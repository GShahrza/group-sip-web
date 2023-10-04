package az.iktlab.bookstore.controller;

import az.iktlab.bookstore.model.dto.request.AccountRequestDTO;
import az.iktlab.bookstore.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/accounts")
public class AccountController {


    private final AccountService accountService;


    @PostMapping
    public void add(@RequestBody AccountRequestDTO accountRequestDTO){
        accountService.add(accountRequestDTO);
    }
}
