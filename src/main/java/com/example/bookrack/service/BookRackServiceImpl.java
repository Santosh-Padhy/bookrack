package com.example.bookrack.service;

import com.example.bookrack.dto.GenericBookDto;
import com.example.bookrack.exception.BookNotFoundException;
import com.example.bookrack.models.Book;
import com.example.bookrack.respository.BookRackRespositiry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookRackServiceImpl implements BookRackService{

    final private BookRackRespositiry bookRackRespositiry;

    BookRackServiceImpl(BookRackRespositiry bookRackRespositiry){
        this.bookRackRespositiry=bookRackRespositiry;
    }


    private static GenericBookDto convertTogenericBookDto(Book book){
        GenericBookDto genericBookDto = new GenericBookDto();
        genericBookDto.setBookName(book.getBookName());
        genericBookDto.setBookPrice(book.getBookPrice());
        genericBookDto.setId(book.getId());
        return genericBookDto;
    }

    @Override
    public GenericBookDto addbook(Book book) {
      return convertTogenericBookDto(bookRackRespositiry.save(book));
    }

    @Override
    public List<GenericBookDto> addAllbook(List<Book> book) {
        //convertTogenericBookDto(bookRackRespositiry.saveAll(book));
        return null;

    }

    @Override
    public List<GenericBookDto> getAllBook() {
        //bookRackRespositiry.findAll();
        List<Book> bookdata = bookRackRespositiry.findAll();
        List<GenericBookDto> genericBookDtosDtos = new ArrayList<>();
        for ( Book book : bookdata) {
            genericBookDtosDtos.add(convertTogenericBookDto(book));
        }
        return genericBookDtosDtos;
    }

    @Override
    public GenericBookDto getBookById(Long id) throws BookNotFoundException {
        Optional<Book> getdetails = bookRackRespositiry.findById(id);
        if(getdetails.isEmpty()){
            throw new BookNotFoundException("Please provide correct id to get Book details "+ id);
        }
            return convertTogenericBookDto(bookRackRespositiry.getById(id));

    }

    @Override
    public void deleteBookById(Long id) throws BookNotFoundException {
        Optional<Book> getdetails = bookRackRespositiry.findById(id);
        if(getdetails.isEmpty()){
            throw new BookNotFoundException("Please provide correct id to delete the book details "+ id);
        }
         bookRackRespositiry.deleteById(id);
    }

    @Override
    public GenericBookDto updateBookById(Long id) throws BookNotFoundException {

        return null;
    }


}//end of class

