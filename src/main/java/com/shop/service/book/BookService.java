package com.shop.service.book;

import com.shop.common.EnumDto;
import com.shop.entity.genre.GenreDto;
import com.shop.model.book.BookDto;

import java.util.List;

public interface BookService {

    void saveGenre(GenreDto dto);

    void saveBook(BookDto dto);

    List<EnumDto> getGenres();
}
