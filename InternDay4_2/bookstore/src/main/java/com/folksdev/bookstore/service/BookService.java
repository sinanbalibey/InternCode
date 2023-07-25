package com.folksdev.bookstore.service;

import com.folksdev.bookstore.model.Book;
import com.folksdev.bookstore.repository.IBookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    private final IBookRepository bookRepository;



    public BookService(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> findBookById(Integer bookId){
       return bookRepository.findById(bookId);
    }
}
