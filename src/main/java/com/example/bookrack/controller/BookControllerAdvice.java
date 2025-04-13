package com.example.bookrack.controller;

import com.example.bookrack.exception.BookNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
public class BookControllerAdvice {

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<String> handlerResourceNotFoundException(BookNotFoundException bx){
        return new ResponseEntity<>(bx.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGenricException(Exception ex){
        return new ResponseEntity<>("Internal server error",HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

