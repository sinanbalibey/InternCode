package com.apachepdfbox.apachepdfbox.repository;

import com.apachepdfbox.apachepdfbox.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {
}
