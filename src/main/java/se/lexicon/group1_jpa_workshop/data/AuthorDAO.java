package se.lexicon.group1_jpa_workshop.data;

import se.lexicon.group1_jpa_workshop.model.Author;

import java.util.Collection;

public interface AuthorDAO {

    AuthorDAO findById(int authorId);

    Collection<Author> findAll();
    Author create(Author author);
    Author update(Author author);
    void delete(int authorId);
}
