package com.shop.model.book;

import com.shop.entity.genre.GenreName;
import lombok.Data;

@Data
public class BookDto {

    private String title;
    private GenreName genre;

}
