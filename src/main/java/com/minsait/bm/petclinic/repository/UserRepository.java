package com.minsait.bm.petclinic.repository;

import com.minsait.bm.petclinic.model.User;
import org.springframework.dao.DataAccessException;

public interface UserRepository {

    void save(User user) throws DataAccessException;
}
