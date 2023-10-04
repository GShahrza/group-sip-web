package az.iktlab.bookstore.model.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;

    String synopsis;

    @OneToMany(mappedBy = "book")
    Set<Review> reviews;

    /*
    title (kitabın adı)
author_id (müəllifin identifikatoru)
genre_id (janrın identifikatoru)
publication_date (nəşr tarixi)
synopsis (kitabın təsviri)
average_rating (ortalama reytinq)
     */
}
