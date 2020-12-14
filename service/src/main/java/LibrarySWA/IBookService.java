package LibrarySWA;

import java.util.List;
import java.util.Optional;
/**
 * Interface for a Book Service
 *
 * @author Andreas Leu
 *
 * */
public interface IBookService {
    List<Book> getAllBooks();

    Book addNewBook(Book newBook);

    Optional<Book> getBookByID(Long id);

    boolean deleteBookByID(Long id);

    Optional<Book> editBook(Book book);
}

