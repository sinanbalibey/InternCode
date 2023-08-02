package com.LoginAndRegister.LoginAndRegister.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LoginAndRegister.LoginAndRegister.entity.User;


public interface IUserRepository  extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
