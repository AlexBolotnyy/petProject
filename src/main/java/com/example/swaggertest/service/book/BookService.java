package com.example.swaggertest.service.book;

import com.example.swaggertest.entity.genre.GenreDto;
import com.example.swaggertest.model.book.BookDto;

public interface BookService {

    void saveGenre(GenreDto dto);

    void saveBook(BookDto dto);
}
