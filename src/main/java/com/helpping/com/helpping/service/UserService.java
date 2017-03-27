package com.helpping.com.helpping.service;

import com.helpping.com.helpping.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}