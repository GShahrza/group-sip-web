package az.iktlab.bookstore.service.impl;

import az.iktlab.bookstore.model.dto.request.ReviewRequestDTO;
import az.iktlab.bookstore.model.dto.response.ReviewResponseDTO;
import az.iktlab.bookstore.model.entity.Review;
import az.iktlab.bookstore.model.mapper.ReviewMapper;
import az.iktlab.bookstore.repository.ReviewRepository;
import az.iktlab.bookstore.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    private final ReviewMapper reviewMapper;

    @Override
    public List<Review> getAllReviewsByBookId(Long bookId, Sort sort) {
        return null;
    }

    @Override
    public List<Review> getAllReviewsByUserId(Long userId, Sort sort) {
        return null;
    }

    @Override
    public boolean addReview(Long userId, Long bookId, ReviewRequestDTO reviewRequestDTO) {
        return false;
    }

    @Override
    public boolean deleteReview(Long userId, Long bookId, Long reviewId) {
        return false;
    }

    @Override
//    @Transactional
    public List<ReviewResponseDTO> getAllReviews() {
        List<Review> reviews = reviewRepository.getAllReviews();

        reviews.forEach(review -> System.out.println(review.getBook().getTitle()));
        return reviews.stream()
                .map(reviewMapper::reviewToReviewResponseDTO)
                .collect(Collectors.toList());
    }
}
