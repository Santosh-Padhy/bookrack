package com.example.bookrack.exception;

public class BookNotFoundException extends Exception{

    // define public constructor
    public BookNotFoundException(String message){
        super(message);
    }
}
