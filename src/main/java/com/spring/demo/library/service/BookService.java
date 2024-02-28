package com.spring.demo.library.service;

import com.spring.demo.library.entity.LibraryBook;
import com.spring.demo.library.repository.BookRepository;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public LibraryBook createBook(LibraryBook book) {
        // Generate a random bookId (you might want to use a different strategy)
        Integer bookId = new Random().nextInt();
        book.setBookId(bookId);
        return bookRepository.save(book);
    }
    public LibraryBook getBook(Integer bookId) {
        Optional<LibraryBook> bookOptional = bookRepository.findById(bookId);
        return bookOptional.orElse(new LibraryBook());
    }
    public LibraryBook updateBook(Integer bookId,LibraryBook book){

        // call the database
        book.setBookId(bookId);
        return bookRepository.save(book);
    }
    public void deleteBook(Integer bookId) {
        // Delete a member by ID using Spring Data JDBC repository
        bookRepository.deleteById(bookId);
        // Alternatively, you can perform additional logic after deletion if needed
    }
}