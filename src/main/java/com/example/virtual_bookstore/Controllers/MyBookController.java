package com.example.virtual_bookstore.Controllers;

import com.example.virtual_bookstore.Entity.MyBook;
import com.example.virtual_bookstore.Services.myBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@RestController
public class MyBookController {
    @Autowired
    private myBookService bookServices;
    public List<MyBook> getAllBooks(){
        return bookServices.getAllBooks();
    }

    public MyBook getById(Long id){
        return bookServices.getById(id);
    }

    public void addBook(MyBook book){
        bookServices.addBook(book);
    }

    public void updateBook(Long id, MyBook newBook){
        bookServices.updateBook(id, newBook);
    }

    public void delById(Long id){
        bookServices.delById(id);
    }
}
