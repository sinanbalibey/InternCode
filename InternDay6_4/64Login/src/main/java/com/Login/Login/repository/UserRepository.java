package com.Login.Login.repository;

import com.Login.Login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);
}
