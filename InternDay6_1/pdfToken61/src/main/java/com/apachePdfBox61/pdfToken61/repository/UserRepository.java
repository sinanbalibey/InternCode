package com.apachePdfBox61.pdfToken61.repository;

import com.apachePdfBox61.pdfToken61.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
