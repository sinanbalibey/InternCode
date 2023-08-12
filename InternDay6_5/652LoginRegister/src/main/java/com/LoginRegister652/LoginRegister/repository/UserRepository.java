package com.LoginRegister652.LoginRegister.repository;

import com.LoginRegister652.LoginRegister.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserName(String username);
}
