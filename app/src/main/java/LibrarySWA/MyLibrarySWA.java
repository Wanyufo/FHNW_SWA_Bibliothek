package LibrarySWA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


/**
 *  MyLibrary Spring Boot Application.
 *
 * @author Andreas Leu
 *
 * */


@SpringBootApplication
public class MyLibrarySWA {
    public static void main(String[] args) {
        SpringApplication.run(MyLibrarySWA.class, args);
    }

    @Bean
    public IBookService bookService(IBooksRepository booksRepository) {
        return new BookService(booksRepository);
    }

    //TODO License
    //TODO Readme Update
    //TODO Tests
    //TODO UI?

}



