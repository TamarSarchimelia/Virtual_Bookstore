package com.example.virtual_bookstore.Services;

import com.example.virtual_bookstore.Entity.book;
import com.example.virtual_bookstore.Repositories.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class myBookService {
    @Autowired
    private MyBookRepository bookRepository;

    public List<book> getAllBooks(){
        return bookRepository.findAll();
    }

    public book getById(Long id){
        return bookRepository.findById(id).get();
    }

    public void addBook(book book){
            bookRepository.save(book);
    }

    public void updateBook(Long id, book newBook){
        if (getById(id)!=null) {
            delById(id);
        }
        addBook(newBook);
    }

    public void delById(Long id){
        bookRepository.deleteById(id);
    }
}
