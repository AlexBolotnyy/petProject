package com.example.swaggertest.entity.genre;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenreName {

    FANTASY("Фэнтези"),
    DRAMA("Драма");

    private final String title;
}
