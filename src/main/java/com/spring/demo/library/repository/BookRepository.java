package com.spring.demo.library.repository;

import com.spring.demo.library.entity.LibraryBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepository extends JpaRepository<LibraryBook, Integer> {
}
