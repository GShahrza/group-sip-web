package az.iktlab.bookstore.model.mapper;

import az.iktlab.bookstore.model.dto.response.ReviewResponseDTO;
import az.iktlab.bookstore.model.entity.Review;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReviewMapper {

    ReviewResponseDTO reviewToReviewResponseDTO(Review review);
}
