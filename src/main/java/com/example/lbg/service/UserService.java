package com.example.lbg.service;

import com.example.lbg.entity.User;

import java.util.Set;

public interface UserService {

    User findByName(String name);
    User findById(Long id);
    User save(User user);
    Set<User> findall();

}
