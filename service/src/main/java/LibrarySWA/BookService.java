package LibrarySWA;


import java.util.List;

public class BookService implements IBookService{
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
}

