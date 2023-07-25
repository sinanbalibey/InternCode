package com.folksdev.bookstore;

import com.folksdev.bookstore.model.Book;
import com.folksdev.bookstore.repository.IBookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	private final IBookRepository bookRepository;


	public BookstoreApplication(IBookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book1=Book.builder()
				.name("Yüzüklerif efendisi")
				.author("J.R.R Tolkien")
				.price(10.0)
				.stock(10).build();
		Book book2=Book.builder()
				.name("Baslangic ")
				.author("Dam brown ")
				.price(11.1)
				.stock(10).build();
		Book book3=Book.builder()
				.name("Tanrını Formulu")
				.author("Santos")
				.price(15.5)
				.stock(10).build();

		bookRepository.saveAll(Arrays.asList(book1,book2,book3));
	}
}
