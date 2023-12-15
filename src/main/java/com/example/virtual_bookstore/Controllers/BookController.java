package com.example.virtual_bookstore.Controllers;


import com.example.virtual_bookstore.Entity.book;
import com.example.virtual_bookstore.Services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {
    private final BookServices bookServices;
    @Autowired
    public BookController(BookServices bookServices){
        this.bookServices=bookServices;
    }
    @GetMapping
    public List<book> getAllBooks(){
        System.out.println("size:  "+bookServices.getAllBooks().size());
        return bookServices.getAllBooks();
    }
    @GetMapping("/{id}")
    public book getById(@PathVariable Long id){
        return bookServices.getById(id);
    }
    @PostMapping
    public void addBook(@PathVariable book book){
        bookServices.addBook(book);
    }
    @PutMapping("/{id}")
    public void updateBook(@PathVariable Long id,@RequestBody book newBook){
        bookServices.updateBook(id, newBook);
    }
    @DeleteMapping("/{id}")
    public void delById(@PathVariable Long id){
        bookServices.delById(id);
    }
}
