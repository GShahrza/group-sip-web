package az.iktlab.bookstore.controller;

import az.iktlab.bookstore.model.entity.Account;
import az.iktlab.bookstore.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;


    @PostMapping()
    public void add(@RequestBody Account account){
        accountRepository.save(account);
    }
}
