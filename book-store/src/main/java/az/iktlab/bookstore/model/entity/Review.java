package az.iktlab.bookstore.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reviews")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String reviewText;

    LocalDateTime reviewDate;

    @ManyToOne
    @JoinColumn(name = "book_id")
    Book book;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User user;

    /*
    review_id (rəyin identifikatoru)
book_id (kitabın identifikatoru)
user_id (istifadəçinin identifikatoru)
review_text (rəy mətni)
rating (kitabın reytinqi)
review_date (rəy tarixi)
     */
}
