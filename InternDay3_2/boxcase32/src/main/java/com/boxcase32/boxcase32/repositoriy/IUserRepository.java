package com.boxcase32.boxcase32.repositoriy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boxcase32.boxcase32.entities.User;

public interface IUserRepository extends JpaRepository<User, Long> {

}
