package az.iktlab.bookstore.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "username", unique = true)
    String username;

    @Column(name = "password")
    String password;

    @Column(name = "is_active",columnDefinition = "BOOLEAN default TRUE")
    boolean isActive = true;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            joinColumns = @JoinColumn(name = "account_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id",referencedColumnName = "id")
    )
    Set<Role> roles;

    @CreationTimestamp
    @Column(name = "created_at",columnDefinition = "timestamp default now()")
    LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at",columnDefinition = "timestamp default now()")
    LocalDateTime updatedAt;

}
