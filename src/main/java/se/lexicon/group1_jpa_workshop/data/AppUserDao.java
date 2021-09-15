package se.lexicon.group1_jpa_workshop.data;

import se.lexicon.group1_jpa_workshop.model.AppUser;

import java.util.Collection;

public interface AppUserDao {

    AppUser findById (int appUserId);
    Collection<AppUser> findAll();
    AppUser create(AppUser appUser);
    AppUser update (AppUser appUser);
    void delete (int appUserId);

}
