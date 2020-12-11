
package book;
import javax.persistence.Entity;

import java.util.Date;

@Entity
public class Book {

    private long id;
    private String Title;
    private String Author;
    private String Type;
    private String Publisher;
    private long ISBN;
    private Date PublicationDate;




}
