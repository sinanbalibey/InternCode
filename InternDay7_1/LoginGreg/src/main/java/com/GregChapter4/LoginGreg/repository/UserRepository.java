package com.GregChapter4.LoginGreg.repository;

import com.GregChapter4.LoginGreg.entity.User;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User,Long> {
    User findByUsername(String username);
}
