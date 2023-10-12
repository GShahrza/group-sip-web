package az.iktlab.bookstore.service;

import az.iktlab.bookstore.model.dto.request.AuthorRequestDTO;
import az.iktlab.bookstore.model.dto.request.BookRequestDTO;
import az.iktlab.bookstore.model.entity.Author;
import az.iktlab.bookstore.model.entity.Book;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AuthorService {


    List<Author> getAllAuthors(Pageable pageable);

    Author getAuthorById(Long id);

    Author getAuthorByFullName(String fullName);

    boolean addAuthor(AuthorRequestDTO authorRequestDTO);

    boolean deleteAuthor(Long id);
}
