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

    @Column(name = "review_text")
    String reviewText;

    @Column(name = "like_count",columnDefinition = "INT default 0")
    Integer likeCount;

    @Column(name = "reviewDate",columnDefinition = "timestamp default now()")
    LocalDateTime reviewDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    Book book;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    User user;
}
