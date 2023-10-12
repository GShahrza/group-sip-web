package az.iktlab.bookstore.service.impl;

import az.iktlab.bookstore.model.dto.request.GenreRequestDTO;
import az.iktlab.bookstore.model.entity.Genre;
import az.iktlab.bookstore.repository.GenreRepository;
import az.iktlab.bookstore.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    @Override
    public List<Genre> getAllGenres(Pageable pageable) {
        return null;
    }

    @Override
    public Genre getGenreById(Long id) {
        return null;
    }

    @Override
    public Genre getGenreByName(String genreName) {
        return null;
    }

    @Override
    public boolean addGenre(GenreRequestDTO genreRequestDTO) {
        return false;
    }

    @Override
    public boolean deleteGenre(Long id) {
        return false;
    }
}
