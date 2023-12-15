package com.example.virtual_bookstore.Controllers;

import com.example.virtual_bookstore.Entity.book;
import com.example.virtual_bookstore.Services.myBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyBookController {
    @Autowired
    private myBookService bookServices;
    public List<book> getAllMyBooks(){
        return bookServices.getAllBooks();
    }

    public book getById(@PathVariable Long id){
        return bookServices.getById(id);
    }

    public void addBook(@PathVariable book book){
        bookServices.addBook(book);
    }

    public void updateBook(@PathVariable Long id,@RequestBody book newBook){
        bookServices.updateBook(id, newBook);
    }

    public void delById(@PathVariable Long id){
        bookServices.delById(id);
    }
}
