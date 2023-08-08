package com.apachePdfBox61.pdfToken61.controller;

import com.apachePdfBox61.pdfToken61.entity.Document;
import com.apachePdfBox61.pdfToken61.services.DocumentServices;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

@RestController
@RequestMapping("/v1/document")
public class DocumentController {
    private final DocumentServices documentServices;


    @Autowired
    public DocumentController(DocumentServices documentServices) {
        this.documentServices = documentServices;
    }

    @PostMapping("/upload")
    public long uploadPdf(@RequestParam("file") MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            return documentServices.calculateWordCount(file.getInputStream());
        }
        return 0;
    }


}
