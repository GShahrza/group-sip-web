package az.iktlab.bookstore.repository;

import az.iktlab.bookstore.model.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {

    @Query("select r from Review r left join fetch r.book left join fetch r.user")
    List<Review> getAllReviews();
}
