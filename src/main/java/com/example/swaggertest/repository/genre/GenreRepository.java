package com.example.swaggertest.repository.genre;

import com.example.swaggertest.entity.genre.Genre;
import com.example.swaggertest.entity.genre.GenreName;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GenreRepository extends CrudRepository<Genre, Long> {

    Optional<Genre> findByName(GenreName name);

}
