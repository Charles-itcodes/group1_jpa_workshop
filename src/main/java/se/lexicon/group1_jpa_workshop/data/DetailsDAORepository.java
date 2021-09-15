package se.lexicon.group1_jpa_workshop.data;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.group1_jpa_workshop.entity.Details;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

@Repository
public class DetailsDAORepository implements DetailsDAO{
    @PersistenceContext
    EntityManager entityManager;

    public DetailsDAORepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public Details findById(int detailsId) {
        return entityManager.find(Details.class, detailsId);
    }
    @Transactional
    @Override
    public Collection<Details> findAll() {
        Query query = entityManager.createQuery("SELECT d FROM Details d");
        return query.getResultList();
    }
    @Transactional
    @Override
    public Details create(Details details) {
        entityManager.persist(details);
        return details;
    }
    @Transactional
    @Override
    public Details update(Details details) {
        return entityManager.merge(details);
    }
    @Transactional
    @Override
    public void delete(int detailsId) {
        entityManager.remove(detailsId);
    }
}
