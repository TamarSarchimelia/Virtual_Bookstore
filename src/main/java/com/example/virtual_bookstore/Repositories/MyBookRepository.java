package com.example.virtual_bookstore.Repositories;


import com.example.virtual_bookstore.Entity.book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyBookRepository extends JpaRepository<book, Long> {
}
