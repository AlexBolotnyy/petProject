package com.shop.service.book;

import com.shop.entity.genre.GenreDto;
import com.shop.model.book.BookDto;

public interface BookService {

    void saveGenre(GenreDto dto);

    void saveBook(BookDto dto);
}
