
package LibrarySWA;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Date;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String author;
    private String type;
    private String publisher;
    private Long isbn;
   // private Date PublicationDate;




}
