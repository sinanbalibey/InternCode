package com.folksdev.bookstore.repository;

import com.folksdev.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository  extends JpaRepository<Book,Integer> {

}
