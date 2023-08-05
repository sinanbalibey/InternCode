package com.justLogins.loginAndRegister5.repository;


import com.justLogins.loginAndRegister5.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
