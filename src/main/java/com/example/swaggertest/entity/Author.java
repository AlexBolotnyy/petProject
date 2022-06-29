package com.example.swaggertest.entity;

import com.example.swaggertest.entity.book.Book;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

//@Entity
//@Data
public class Author {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;

    private String secondName;

    private List<Book> books;

}
