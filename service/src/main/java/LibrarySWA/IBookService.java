package LibrarySWA;

import java.util.List;

public interface IBookService {
    List<Book> getAllBooks();
    Book addNewBook(Book newBook);
}
