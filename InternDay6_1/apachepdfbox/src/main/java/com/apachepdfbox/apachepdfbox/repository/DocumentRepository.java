package com.apachepdfbox.apachepdfbox.repository;

import com.apachepdfbox.apachepdfbox.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository  extends JpaRepository<Document,Long> {
}
