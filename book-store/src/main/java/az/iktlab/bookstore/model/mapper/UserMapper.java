package az.iktlab.bookstore.model.mapper;

import az.iktlab.bookstore.model.dto.request.SignUpRequestDTO;
import az.iktlab.bookstore.model.dto.response.UserResponseDTO;
import az.iktlab.bookstore.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User signUpRequestDTOtoUser(SignUpRequestDTO signUpRequestDTO);

    UserResponseDTO userToUserResponseDTO(User user);
}
