package az.iktlab.bookstore.service;

import az.iktlab.bookstore.model.dto.request.AccountRequestDTO;
import az.iktlab.bookstore.model.dto.request.SignUpRequestDTO;
import az.iktlab.bookstore.model.entity.Account;

public interface AccountService {

    Account add(SignUpRequestDTO signUpRequestDTO);

    Account getAccountByUsername(String username);

    boolean updateUsername(Long id, String username);

    boolean updatePassword(Long id, String password);
}
