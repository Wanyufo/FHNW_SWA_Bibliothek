
package LibrarySWA;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Date;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String Title;
    private String Author;
    private String Type;
    private String Publisher;
    private long ISBN;
    private Date PublicationDate;




}
