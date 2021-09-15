package se.lexicon.group1_jpa_workshop.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.group1_jpa_workshop.model.Book;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@SpringBootTest
@AutoConfigureTestDatabase
@AutoConfigureTestEntityManager
@Transactional
class BookDAORepositoryTest {


   private  BookDAO bookDAO;
   private TestEntityManager entityManager;

    public BookDAORepositoryTest(BookDAO bookDAO, TestEntityManager entityManager) {
        this.bookDAO = bookDAO;
        this.entityManager = entityManager;
    }

 List<Book> books = Arrays.asList(

         new Book("hggdd", "HarryPotter", 10),
         new Book("hggdd", "SilverSpoon", 10),
         new Book("hggdd", "Half of the yellow sun", 10),
         new Book("hggdd", "Purple Hibiscus", 10),
         new Book("hggdd", "Harley Chase", 10),
         new Book("hggdd", "Lord of the rings", 10),
         new Book("hggdd", "good Momemnt", 10)
 ) ;

    @BeforeEach
    void setUp() {

        books = books.stream()
                .map(entityManager::persist)
                        .collect(Collectors.toList());


       // AppUser appUser = new AppUser("sanya", "123" ,"s.ogunjobi@gmail.com", );

      //  Details sanyaDetails = entityManager.persist(new Details("Sanya",

    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {

    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}