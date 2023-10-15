package az.iktlab.bookstore.model.dto.response;

import az.iktlab.bookstore.model.entity.Book;
import az.iktlab.bookstore.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewResponseDTO {

    Long id;
    String reviewText;
    Integer likeCount;
    LocalDateTime reviewDate;

}
