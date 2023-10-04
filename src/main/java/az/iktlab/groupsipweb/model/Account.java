package az.iktlab.groupsipweb.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {

    Long id;
    String username;
    String password;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
