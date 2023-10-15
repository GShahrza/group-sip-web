package az.iktlab.bookstore.service;

import az.iktlab.bookstore.model.dto.request.ReviewRequestDTO;
import az.iktlab.bookstore.model.dto.response.ReviewResponseDTO;
import az.iktlab.bookstore.model.entity.Review;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReviewsByBookId(Long bookId, Sort sort);

    List<Review> getAllReviewsByUserId(Long userId, Sort sort);

    boolean addReview(Long userId, Long bookId, ReviewRequestDTO reviewRequestDTO);

    boolean deleteReview(Long userId, Long bookId, Long reviewId);

    List<ReviewResponseDTO> getAllReviews();

}
