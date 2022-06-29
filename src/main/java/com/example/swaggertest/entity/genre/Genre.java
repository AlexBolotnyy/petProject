package com.example.swaggertest.entity.genre;

import com.example.swaggertest.entity.book.Book;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "genre")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private GenreName name;

    private String title;

    @OneToMany(mappedBy = "genre")
    private List<Book> books;
}
