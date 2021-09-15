package se.lexicon.group1_jpa_workshop.data;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.group1_jpa_workshop.model.BookLoan;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

@Repository
public class BookLoanDAORepository implements BookLoanDAO{

    @PersistenceContext
    EntityManager entityManager;



    @Override
    @Transactional
    public BookLoan findById(int loanId) {
        return entityManager.find(BookLoan.class, loanId);
    }

    @Override
    @Transactional
    public Collection<BookLoan> findAll() {
        Query query =  entityManager.createQuery("SELECT b FROM BookLoan b");

        return query.getResultList();
    }

    @Override
    @Transactional
    public BookLoan create(BookLoan bookLoan) {

        entityManager.persist(bookLoan);
        return bookLoan;
    }

    @Override
    @Transactional
    public BookLoan update(BookLoan bookLoan) {

        return entityManager.merge(bookLoan);
    }

    @Override
    @Transactional
    public void delete(int loanId) {

    entityManager.remove(loanId);
    }
}
