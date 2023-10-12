package az.iktlab.bookstore.model.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SignUpRequestDTO {

    @NotNull
    String firstName;

    @NotEmpty(message = "last name can not empty!")
    String lastName;

    @Email
    String email;

    @NotBlank
    String contactNumber;

    String username;

    @Pattern(regexp = "[0-9]+")
    String password;
}
