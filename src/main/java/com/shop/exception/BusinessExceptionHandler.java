package com.shop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestControllerAdvice
public class BusinessExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(NOT_FOUND)
    public ErrorMessage businessException(RuntimeException ex) {
        return new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
    }
}
