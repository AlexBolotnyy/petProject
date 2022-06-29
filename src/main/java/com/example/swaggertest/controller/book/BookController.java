package com.example.swaggertest.controller.book;


import com.example.swaggertest.entity.genre.GenreDto;
import com.example.swaggertest.model.book.BookDto;
import com.example.swaggertest.service.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

