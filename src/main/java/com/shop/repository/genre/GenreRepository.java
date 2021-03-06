package com.shop.repository.genre;

import com.shop.entity.genre.Genre;
import com.shop.entity.genre.GenreName;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GenreRepository extends CrudRepository<Genre, Long> {

    Optional<Genre> findByName(GenreName name);

}
