package com.project.questapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.questapp.entities.User;

public interface IUserRepository extends JpaRepository<User, Long> {

	
	
}
