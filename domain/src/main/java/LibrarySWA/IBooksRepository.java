package LibrarySWA;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface for a Books Repository
 *
 * @author Andreas Leu
 *
 * */
@Repository
public interface IBooksRepository extends JpaRepository<Book, Long> {
}
