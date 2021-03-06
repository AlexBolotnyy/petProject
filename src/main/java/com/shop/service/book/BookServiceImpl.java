package com.shop.service.book;

import com.shop.common.EnumDto;
import com.shop.entity.book.Book;
import com.shop.entity.genre.Genre;
import com.shop.entity.genre.GenreDto;
import com.shop.entity.genre.GenreName;
import com.shop.model.book.BookDto;
import com.shop.repository.book.BookRepository;
import com.shop.repository.genre.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final GenreRepository genreRepository;
    private final BookRepository bookRepository;

    @Override
    public void saveGenre(GenreDto dto) {
        Genre genre = new Genre();
        genre.setTitle(dto.getName().getTitle());
        genre.setName(dto.getName());
        genreRepository.save(genre);
    }

    @Override
    public void saveBook(BookDto dto) {
        Book book = new Book();
        book.setTitle(dto.getTitle());
        book.setGenre(getGenre(dto.getGenre()));
        bookRepository.save(book);
    }

    @Override
    public List<EnumDto> getGenres() {

//        List<EnumDto> result = new ArrayList<>();
//        Arrays.stream(GenreName.values()).forEach(g ->
//                result.add(new EnumDto(g.name(), g.getTitle())));
//        return result;
        throw new RuntimeException("Тестовое сообщение");
    }

    private Genre getGenre(GenreName name) {
        return genreRepository.findByName(name).orElse(null);
    }
}
