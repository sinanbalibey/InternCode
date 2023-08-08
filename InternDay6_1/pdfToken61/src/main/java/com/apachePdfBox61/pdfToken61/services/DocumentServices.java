package com.apachePdfBox61.pdfToken61.services;

import com.apachePdfBox61.pdfToken61.entity.Document;
import com.apachePdfBox61.pdfToken61.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

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
