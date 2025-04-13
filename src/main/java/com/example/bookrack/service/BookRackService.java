package com.example.bookrack.service;

import com.example.bookrack.dto.GenericBookDto;
import com.example.bookrack.exception.BookNotFoundException;
import com.example.bookrack.models.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface BookRackService {

    public GenericBookDto addbook(Book book);
    public List<GenericBookDto>  addAllbook(List<Book> book);
    public List<GenericBookDto> getAllBook();
    public GenericBookDto getBookById(Long id) throws BookNotFoundException;
    public void deleteBookById(Long id) throws BookNotFoundException;
    public GenericBookDto updateBookById(Long id) throws BookNotFoundException;

}
