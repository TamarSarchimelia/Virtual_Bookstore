package com.example.virtual_bookstore.Repositories;

import com.example.virtual_bookstore.Entity.book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<book, Long> {
}
