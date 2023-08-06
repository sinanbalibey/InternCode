package com.apachepdfbox.apachepdfbox.services;

import com.apachepdfbox.apachepdfbox.entity.Document;
import com.apachepdfbox.apachepdfbox.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentServices {

    private final DocumentRepository documentRepository;

    @Autowired
    public DocumentServices(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;

    }

    public void uploadDocument(Document document){
        documentRepository.save(document);
    }
}
