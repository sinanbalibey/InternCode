package com.apachePdfBox61.pdfToken61.services;

import com.apachePdfBox61.pdfToken61.entity.Document;
import com.apachePdfBox61.pdfToken61.repository.DocumentRepository;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@Service
public class DocumentServices {



    private final DocumentRepository documentRepository;


    @Autowired
    public DocumentServices(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }


    public long calculateWordCount(InputStream pdfInputStream) throws IOException {
        try (PDDocument document = PDDocument.load(pdfInputStream)) {
            PDFTextStripper stripper = new PDFTextStripper();
            String text = stripper.getText(document);
            String[] words = text.split("\\s+");
            return words.length;
        }
    }

}
