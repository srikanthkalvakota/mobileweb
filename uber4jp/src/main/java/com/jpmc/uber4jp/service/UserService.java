package com.jpmc.uber4jp.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import com.jpmc.uber4jp.model.User;
 
public interface UserService {
     
    User findById(Long id);
 
    User findByName(String name);
 
    void saveUser(User user);
 
    void updateUser(User user);
 
    void deleteUserById(Long id);
 
    void deleteAllUsers();
 
    List<User> findAllUsers();
 
    boolean isUserExist(User user);

}