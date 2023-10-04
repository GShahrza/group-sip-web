package az.iktlab.bookstore.repository;

import az.iktlab.bookstore.model.entity.Role;
import az.iktlab.bookstore.model.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByRoleName(ERole role);
}
