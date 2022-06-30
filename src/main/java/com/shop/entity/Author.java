package com.shop.entity;

import com.shop.entity.book.Book;

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
