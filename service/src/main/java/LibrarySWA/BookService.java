package LibrarySWA;


import java.util.List;
import java.util.Optional;

public class BookService implements IBookService {
    private final IBooksRepository booksRepository;

    public BookService(IBooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }


    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }


    public Book addNewBook(Book newBook) {
        return booksRepository.save(newBook);
    }

    public Optional<Book> getBookByID(Long id) {
        return booksRepository.findById(id);
    }

    public boolean deleteBookByID(Long id) {
        if (booksRepository.existsById(id)) {
            booksRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public Optional<Book> editBook(Book book) {
        if(book.getId() == null || !booksRepository.existsById(book.getId())){
            return Optional.empty();
        }
        else {
            return Optional.of(booksRepository.save(book));
        }
    }
}

