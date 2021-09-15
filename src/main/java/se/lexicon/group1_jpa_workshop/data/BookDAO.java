package se.lexicon.group1_jpa_workshop.data;

import se.lexicon.group1_jpa_workshop.model.Book;

import java.util.Collection;

public interface BookDAO {

    Book findById(int bookId);
    Book findByBookTitle(String title);
    Collection<Book> findAll();
    Book create(Book book);
    Book update(Book book);
    void delete(int bookId);


}
