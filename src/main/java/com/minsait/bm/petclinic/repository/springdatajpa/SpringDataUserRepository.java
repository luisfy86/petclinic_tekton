package com.minsait.bm.petclinic.repository.springdatajpa;

import com.minsait.bm.petclinic.model.User;
import com.minsait.bm.petclinic.repository.UserRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.Repository;

@Profile("spring-data-jpa")
public interface SpringDataUserRepository extends UserRepository, Repository<User, Integer>  {

}
