package com.example.virtual_bookstore.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "myBook")
@Data
public class MyBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private Double price;
}
