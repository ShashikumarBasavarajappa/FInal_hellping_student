package com.helpping.com.helpping.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}