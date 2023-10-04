package az.iktlab.bookstore.repository;

import az.iktlab.bookstore.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

    boolean existsByUsername(String username);
}
