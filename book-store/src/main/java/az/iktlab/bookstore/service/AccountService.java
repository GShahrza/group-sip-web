package az.iktlab.bookstore.service;

import az.iktlab.bookstore.model.dto.request.AccountRequestDTO;
import az.iktlab.bookstore.model.entity.Account;

public interface AccountService {

    void add(AccountRequestDTO accountRequestDTO);
}
