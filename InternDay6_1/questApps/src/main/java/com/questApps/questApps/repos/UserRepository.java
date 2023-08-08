package com.questApps.questApps.repos;

import com.questApps.questApps.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
