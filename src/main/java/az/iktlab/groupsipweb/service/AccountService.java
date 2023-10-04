package az.iktlab.groupsipweb.service;

import az.iktlab.groupsipweb.entity.Account;
import az.iktlab.groupsipweb.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account getAccount(Long id){
        return accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("account not found"));
    }
}
