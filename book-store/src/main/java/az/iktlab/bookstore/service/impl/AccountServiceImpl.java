package az.iktlab.bookstore.service.impl;

import az.iktlab.bookstore.model.dto.request.SignUpRequestDTO;
import az.iktlab.bookstore.model.entity.Account;
import az.iktlab.bookstore.model.entity.Role;
import az.iktlab.bookstore.model.enums.ERole;
import az.iktlab.bookstore.model.mapper.AccountMapper;
import az.iktlab.bookstore.repository.AccountRepository;
import az.iktlab.bookstore.repository.RoleRepository;
import az.iktlab.bookstore.service.AccountService;
import az.iktlab.bookstore.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    private final RoleService roleService;

    private final AccountMapper accountMapper;

    private final RoleRepository roleRepository;


    @Override
    public Account add(SignUpRequestDTO signUpRequestDTO) {
        Role role = roleService.findByName(ERole.USER);

        if(!accountRepository.existsByUsername(signUpRequestDTO.getUsername())) {
            Account account = accountMapper.signUpRequestDTOtoAccount(signUpRequestDTO);
            return accountRepository.save(account);
        }
        throw new RuntimeException("Account not saved");
    }

    @Override
    public Account getAccountByUsername(String username){
        return accountRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("account not found"));
    }

    @Override
    public boolean updateUsername(Long id, String username) {
        return false;
    }

    @Override
    public boolean updatePassword(Long id, String password) {
        return false;
    }
}
