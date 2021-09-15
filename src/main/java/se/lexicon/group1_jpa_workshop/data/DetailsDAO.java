package se.lexicon.group1_jpa_workshop.data;

import se.lexicon.group1_jpa_workshop.model.Details;

import java.util.Collection;

public interface DetailsDAO {

    Details findById (int detailsId);
    Collection<Details> findAll();
    Details create(Details details);
    Details update (Details details);
    void delete (int detailsId);
}
