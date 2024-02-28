package com.spring.demo.library.controller;

import com.spring.demo.library.model.Book;
import com.spring.demo.library.entity.LibraryBook;
import com.spring.demo.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;
    @GetMapping("/{bookId}")
    public LibraryBook getBookById(@PathVariable Integer bookId) {
        return bookService.getBook(bookId);
    }

    @PostMapping
    public LibraryBook createBook(@RequestBody LibraryBook book) {
        return bookService.createBook(book);
    }

    @PutMapping("/{bookId}")
    public LibraryBook updateBook(@PathVariable Integer bookId, @RequestBody LibraryBook updatedBook) {
        return bookService.updateBook(bookId, updatedBook);
    }
    @DeleteMapping("/{bookId}")
    public void deleteBook(@PathVariable Integer bookId) {
        bookService.deleteBook(bookId);
    }
}
