package com.example.virtual_bookstore.Services;

import com.example.virtual_bookstore.Entity.MyBook;
import com.example.virtual_bookstore.Repositories.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class myBookService {
    @Autowired
    private MyBookRepository bookRepository;

    public List<MyBook> getAllBooks(){
        return bookRepository.findAll();
    }

    public MyBook getById(Long id){
        return bookRepository.findById(id).orElse(null);
    }

    public void addBook(MyBook book){
        //    bookRepository.save(book);
    }

    public void updateBook(Long id, MyBook newBook){
        if (getById(id)!=null) {
            delById(id);
        }
        addBook(newBook);
    }

    public void delById(Long id){
        bookRepository.deleteById(id);
    }
}
