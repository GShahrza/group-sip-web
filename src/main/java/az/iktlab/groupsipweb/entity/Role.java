package az.iktlab.groupsipweb.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "role")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Enumerated(value = EnumType.STRING)
    ERole name;

    @CreationTimestamp
    @Column(name = "created_at",columnDefinition = "timestamp default now()")
    LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at",columnDefinition = "timestamp default now()")
    LocalDateTime updatedAt;
}
