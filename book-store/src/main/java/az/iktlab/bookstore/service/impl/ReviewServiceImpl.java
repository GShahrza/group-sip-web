package az.iktlab.bookstore.service.impl;

import az.iktlab.bookstore.model.dto.request.ReviewRequestDTO;
import az.iktlab.bookstore.model.entity.Review;
import az.iktlab.bookstore.repository.ReviewRepository;
import az.iktlab.bookstore.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

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
}
