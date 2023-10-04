package az.iktlab.groupsipweb.controller;

import az.iktlab.groupsipweb.entity.Account;
import az.iktlab.groupsipweb.repository.AccountRepository;
import az.iktlab.groupsipweb.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequiredArgsConstructor
@RequestMapping("/accounts")
public class AccountController {

    private final AccountRepository accountRepository;

    private final AccountService accountService;

    public AccountController(AccountRepository accountRepository, AccountService accountService) {
        this.accountRepository = accountRepository;
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> getAccounts(){
        return accountRepository.findAll();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id){
        return accountService.getAccount(id);
    }

    @PostMapping
    public void addAccount(@RequestBody Account account){
        accountRepository.save(account);
    }
    


}
