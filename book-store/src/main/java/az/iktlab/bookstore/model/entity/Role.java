package az.iktlab.bookstore.model.entity;


import az.iktlab.bookstore.model.enums.ERole;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "role_name")
    @Enumerated(value = EnumType.STRING)
    ERole roleName;
}
