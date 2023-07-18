package com.questapp2.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questapp2.demo.entities.User;

public interface IUserRepository extends JpaRepository<User, Long>{

	
	
}
