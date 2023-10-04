package az.iktlab.bookstore.service.impl;

import az.iktlab.bookstore.model.dto.request.AccountRequestDTO;
import az.iktlab.bookstore.model.entity.Account;
import az.iktlab.bookstore.model.entity.Role;
import az.iktlab.bookstore.model.enums.ERole;
import az.iktlab.bookstore.repository.AccountRepository;
import az.iktlab.bookstore.repository.RoleRepository;
import az.iktlab.bookstore.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    private final RoleRepository roleRepository;


    @Override
    public void add(AccountRequestDTO accountRequestDTO) {
        Role role = roleRepository.findByRoleName(ERole.USER);

        if(!accountRepository.existsByUsername(accountRequestDTO.getUsername())) {
            Account account = Account.builder()
                    .username(accountRequestDTO.getUsername())
                    .password(accountRequestDTO.getPassword())
                    .roles(Set.of(role))
                    .build();
            accountRepository.save(account);
        }else {
            System.out.println(" Username is exist");
        }



    }
}
