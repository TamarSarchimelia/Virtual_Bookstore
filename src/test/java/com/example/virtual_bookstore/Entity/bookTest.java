package com.example.virtual_bookstore.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bookTest {
    book book;

    @BeforeEach
    void setUp() {
        book = new book();
    }

    @Test
    void getId() throws Exception{
        Long idValue = 2L;
        book.setId(idValue);
        assertEquals(idValue,book.getId());
    }

    @Test
    void getTitle() {
    }

    @Test
    void getAuthor() {
    }

    @Test
    void getPrice() {
    }
}