package com.shop.controller.book;


import com.shop.common.EnumDto;
import com.shop.entity.genre.GenreDto;
import com.shop.model.book.BookDto;
import com.shop.service.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("/add-genre")
    public void saveGenre(GenreDto dto) {

        bookService.saveGenre(dto);
    }

    @PostMapping("/add")
    public void saveBook(BookDto dto) {

        bookService.saveBook(dto);
    }

    @PostMapping("/get-genres")
    public List<EnumDto> getGenres() {

       return bookService.getGenres();
    }
}

