package se.lexicon.group1_jpa_workshop.data;

import se.lexicon.group1_jpa_workshop.entity.Book;
import se.lexicon.group1_jpa_workshop.entity.BookLoan;

import java.util.Collection;

public interface BookDAO {

    Book findById(int bookId);
    Book findByBookTitle(String title);
    Collection<Book> findAll();
    Book create(Book book);
    Book update(Book book);
    void delete(int bookId);


}
