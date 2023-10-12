package az.iktlab.bookstore.model.entity;

import lombok.*;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "email")
    String email;

    @Column(name = "contact_number")
    String contactNumber;

    @Column(name = "registration_date",columnDefinition = "TIMESTAMP default now()")
    LocalDateTime registrationDate = LocalDateTime.now();

    @OneToOne
    @JoinColumn(name = "account_id")
    Account account;

    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    Set<Review> reviews;
}
