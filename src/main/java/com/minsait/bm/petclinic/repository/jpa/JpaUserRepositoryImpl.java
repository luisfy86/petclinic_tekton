package com.minsait.bm.petclinic.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.minsait.bm.petclinic.model.User;
import com.minsait.bm.petclinic.repository.UserRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
@Profile("jpa")
public class JpaUserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(User user) throws DataAccessException {
        if (this.em.find(User.class, user.getUsername()) == null) {
            this.em.persist(user);
        } else {
            this.em.merge(user);
        }
    }
}
