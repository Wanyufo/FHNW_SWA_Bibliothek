package LibrarySWA;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    private final IBookService bookService;

    public BookController(IBookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @PostMapping
    public ResponseEntity<Book> addNewBook(@RequestBody Book newBook) {
        Book addedBook = bookService.addNewBook(newBook);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedBook);
    }

    @GetMapping("{id}")
    public ResponseEntity<Book> getBookByID(@PathVariable Long id) {
        Optional<Book> bookOptional = bookService.getBookByID(id);
        if(bookOptional.isPresent()) {
            return ResponseEntity.ok(bookOptional.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book bookToEdit) {
        bookToEdit.setId(id);
        Optional<Book> bookOptional = bookService.editBook(bookToEdit);
        if(bookOptional.isPresent()) {
            return ResponseEntity.ok(bookOptional.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteBookByID(@PathVariable Long id) {
        boolean success = bookService.deleteBookByID(id);
        if (success) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
}
