package com.pdfTokenApache.pdfTokenApache.repository;

import com.pdfTokenApache.pdfTokenApache.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByMobile(String mobile);

}
