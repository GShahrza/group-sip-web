package az.iktlab.bookstore.model.mapper;

import az.iktlab.bookstore.model.dto.request.SignUpRequestDTO;
import az.iktlab.bookstore.model.dto.response.AccountResponseDTO;
import az.iktlab.bookstore.model.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    @Mapping(target = "username", source = "signUpRequestDTO.username")
    Account signUpRequestDTOtoAccount(SignUpRequestDTO signUpRequestDTO);

    AccountResponseDTO accountToAccountResponseDTO(Account account);
}
