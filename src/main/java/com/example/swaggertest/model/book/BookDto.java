package com.example.swaggertest.model.book;

import com.example.swaggertest.entity.genre.GenreName;
import lombok.Data;

@Data
public class BookDto {

    private String title;
    private GenreName genre;

}
