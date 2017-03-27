package com.helpping.com.helpping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helpping.com.helpping.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	User findByUsername(String username);
	
}
