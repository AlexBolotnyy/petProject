package com.example.swaggertest.repository.book;

import com.example.swaggertest.entity.book.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
