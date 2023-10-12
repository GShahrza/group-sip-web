package az.iktlab.bookstore.service;

import az.iktlab.bookstore.model.dto.request.BookRequestDTO;
import az.iktlab.bookstore.model.entity.Book;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks(Pageable pageable);

    List<Book> getAllBooksByGenre(String genreName, Pageable pageable);

    Book getBookById(Long id);

    boolean addBook(BookRequestDTO bookRequestDTO);

    boolean deleteBook(Long id);
}
