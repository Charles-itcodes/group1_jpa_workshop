package se.lexicon.group1_jpa_workshop.data;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.group1_jpa_workshop.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;
@Repository
public class BookDAORepository implements  BookDAO{

    @PersistenceContext
    EntityManager entityManager;


    @Override
    @Transactional
    public Book findById(int bookId) {
        return entityManager.find(Book.class, bookId);
    }

    @Override
    public Book findByBookTitle(String title) {


        return null;
    }

    @Override
    @Transactional
    public Collection<Book> findAll() {
        Query query = entityManager.createQuery("SELECT b FROM Book b");

        return query.getResultList();
    }

    @Override
    @Transactional
    public Book create(Book book) {

        entityManager.persist(book);
        return book;
    }

    @Override
    @Transactional
    public Book update(Book book) {
        return entityManager.merge(book);
    }

    @Override
    @Transactional
    public void delete(int bookId) {
    entityManager.remove(bookId);
    }
}
