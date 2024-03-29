package com.resultservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resultservice.model.User;


public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUsername(String username);
	User findByUsernameAndPassword(String username, String password);

}
