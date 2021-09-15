package se.lexicon.group1_jpa_workshop.data;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.group1_jpa_workshop.model.AppUser;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

@Repository
public class AppUserDAORepository implements AppUserDao{

    @PersistenceContext
    EntityManager entityManager;

    public AppUserDAORepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public AppUser findById(int appUserId) {
        return entityManager.find(AppUser.class, appUserId);
    }
    @Transactional
    @Override
    public Collection<AppUser> findAll() {
        Query query = entityManager.createQuery("SELECT a FROM AppUser a");
        return query.getResultList();
    }
    @Transactional
    @Override
    public AppUser create(AppUser appUser) {
        entityManager.persist(appUser);
        return appUser;
    }
    @Transactional
    @Override
    public AppUser update(AppUser appUser) {
        return entityManager.merge(appUser);
    }
    @Transactional
    @Override
    public void delete(int appUserId) {
        entityManager.remove(appUserId);

    }
}
