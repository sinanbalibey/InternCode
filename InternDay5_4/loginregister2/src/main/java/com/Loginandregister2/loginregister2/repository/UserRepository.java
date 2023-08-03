package com.Loginandregister2.loginregister2.repository;

import com.Loginandregister2.loginregister2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);
}
