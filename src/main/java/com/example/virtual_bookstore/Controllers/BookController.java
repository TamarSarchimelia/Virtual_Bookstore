package com.example.virtual_bookstore.Controllers;

import com.example.virtual_bookstore.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private BookRepository bookRepository;
}
