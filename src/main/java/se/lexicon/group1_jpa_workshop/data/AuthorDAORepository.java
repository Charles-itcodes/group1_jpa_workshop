package se.lexicon.group1_jpa_workshop.data;

import org.springframework.stereotype.Repository;
import se.lexicon.group1_jpa_workshop.model.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.Collection;

@Repository
public class AuthorDAORepository implements AuthorDAO {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    @Transactional
    public AuthorDAO findById(int authorId) {

        return entityManager.find(AuthorDAO.class, authorId);
    }

    @Override
    @Transactional
    public Collection<Author> findAll() {

        Query query = entityManager.createQuery("SELECT a FROM Author a");
        return query.getResultList();
    }

    @Override
    @Transactional
    public Author create(Author author) {
        entityManager.persist(author);
        return author;
    }

    @Override
    @Transactional
    public Author update(Author author) {
        return entityManager.merge(author);
    }

    @Override
    @Transactional
    public void delete(int authorId) {
    entityManager.remove(authorId);
    }

}
