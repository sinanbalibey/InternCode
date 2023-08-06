package com.apachepdfbox.apachepdfbox.controller;

import com.apachepdfbox.apachepdfbox.entity.Document;
import com.apachepdfbox.apachepdfbox.services.DocumentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/document")
public class DocumentController {

    private final DocumentServices documentServices;

    @Autowired
    public DocumentController(DocumentServices documentServices) {
        this.documentServices = documentServices;
    }

    @PostMapping("/upload")
    public void uploadDocument(@RequestBody Document document){
        documentServices.uploadDocument(document);
    }
}
