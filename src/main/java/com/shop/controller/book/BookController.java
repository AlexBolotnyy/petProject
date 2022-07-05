package com.shop.controller.book;


import com.shop.common.EnumDto;
import com.shop.entity.genre.GenreDto;
import com.shop.model.book.BookDto;
import com.shop.service.book.BookService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.GetMapping;
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
    @Operation(summary = "Добавление новой книги")
    public void saveBook(@ParameterObject BookDto dto) {

        bookService.saveBook(dto);
    }

    @GetMapping("/get-genres")
    public List<EnumDto> getGenres() {

       return bookService.getGenres();
    }
}

