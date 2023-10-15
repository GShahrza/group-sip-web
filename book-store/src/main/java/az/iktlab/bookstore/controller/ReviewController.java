package az.iktlab.bookstore.controller;

import az.iktlab.bookstore.model.dto.response.ReviewResponseDTO;
import az.iktlab.bookstore.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;


    @GetMapping
    public List<ReviewResponseDTO> getAllReviews(){
        return reviewService.getAllReviews();
    }
}

