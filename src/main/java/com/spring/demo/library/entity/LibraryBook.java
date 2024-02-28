package com.spring.demo.library.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Table(name="book")
@Entity
@Data
public class LibraryBook {

    @Id
    @Column(name="book_id")
    private Integer bookId;

    @Column(name="title")
    private String titleName;

    @Column(name="author_name")
    private String authorName;

    @Column(name="year_published")
    private Integer yearPublished;

    @Column(name="quantity")
    private Integer quantity;
    // lombok
}