package com.niit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niit.model.User;

public interface UserRepository extends JpaRepository<User, Long> 
{
	User findByUsername(String username);
	User findByEmailId(String email);
	User findByUserId(int userid);
}
