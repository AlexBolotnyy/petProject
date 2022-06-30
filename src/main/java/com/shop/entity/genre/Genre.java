package com.shop.entity.genre;

import com.shop.entity.book.Book;
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
