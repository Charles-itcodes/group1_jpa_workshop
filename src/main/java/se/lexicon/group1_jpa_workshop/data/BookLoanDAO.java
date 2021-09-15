package se.lexicon.group1_jpa_workshop.data;

import se.lexicon.group1_jpa_workshop.entity.BookLoan;

import java.util.Collection;

public interface BookLoanDAO {

    BookLoan findById(int loanId);
    Collection<BookLoan> findAll();
    BookLoan create(BookLoan bookLoan);
    BookLoan update(BookLoan bookLoan);
    void delete(int loanId);
}
