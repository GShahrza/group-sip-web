package az.iktlab.bookstore.service;

import az.iktlab.bookstore.model.dto.request.GenreRequestDTO;
import az.iktlab.bookstore.model.entity.Genre;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface GenreService {

    List<Genre> getAllGenres(Pageable pageable);

    Genre getGenreById(Long id);

    Genre getGenreByName(String genreName);

    boolean addGenre(GenreRequestDTO genreRequestDTO);

    boolean deleteGenre(Long id);
}
