package com.pdfTokenApache.pdfTokenApache.repository;

import com.pdfTokenApache.pdfTokenApache.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
