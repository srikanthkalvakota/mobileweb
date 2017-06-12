package com.jpmc.uber4jp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpmc.uber4jp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
 
    User findByName(String name);
 
}