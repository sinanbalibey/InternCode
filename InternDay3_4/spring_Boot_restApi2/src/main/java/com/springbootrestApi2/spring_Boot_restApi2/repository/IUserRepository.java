package com.springbootrestApi2.spring_Boot_restApi2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootrestApi2.spring_Boot_restApi2.entity.User;

public interface IUserRepository extends JpaRepository<User, Long> {

	
	/*
	User findByFirstName(String firstName);
	User findByFirstAndLastName(String firstName,String lastName);*/
}
