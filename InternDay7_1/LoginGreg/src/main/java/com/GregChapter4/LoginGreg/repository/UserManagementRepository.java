package com.GregChapter4.LoginGreg.repository;

import com.GregChapter4.LoginGreg.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserManagementRepository extends JpaRepository<User,Long> {
}
