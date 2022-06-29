package com.example.swaggertest.service.book;

import com.example.swaggertest.entity.book.Book;
import com.example.swaggertest.entity.genre.Genre;
import com.example.swaggertest.entity.genre.GenreDto;
import com.example.swaggertest.entity.genre.GenreName;
import com.example.swaggertest.model.book.BookDto;
import com.example.swaggertest.repository.book.BookRepository;
import com.example.swaggertest.repository.genre.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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

    private Genre getGenre(GenreName name) {
        return genreRepository.findByName(name).orElse(null);
    }
}
