package com.example.virtual_bookstore.Controllers;


import com.example.virtual_bookstore.Entity.book;
import com.example.virtual_bookstore.Services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;


@RestController
public class BookController {
    @Autowired
    private BookServices bookServices;
    public List<book> getAllBooks(){
        return bookServices.getAllBooks();
    }

    public book getById(Long id){
        return bookServices.getById(id);
    }

    public void addBook(Book book){
        bookServices.addBook(book);
    }

    public void updateBook(Long id, Book newBook){
        bookServices.updateBook(id, newBook);
    }

    public void delById(Long id){
        bookServices.delById(id);
    }
}
