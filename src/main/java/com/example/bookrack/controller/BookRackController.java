package com.example.bookrack.controller;

import com.example.bookrack.dto.GenericBookDto;
import com.example.bookrack.exception.BookNotFoundException;
import com.example.bookrack.models.Book;
import com.example.bookrack.service.BookRackService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookRackController {


    private BookRackService bookRackService;


    BookRackController(BookRackService bookRackService) {

        this.bookRackService = bookRackService;
    }

    @PostMapping("/add_book")
    public GenericBookDto addBook(@RequestBody Book book) {
        return bookRackService.addbook(book);

    }

    @PostMapping
    public List<GenericBookDto> addAllBook(@RequestBody List<Book> book){
        return null;
    }

    @GetMapping("/get_all_book")
    public List<GenericBookDto> getAllBook() {
        return bookRackService.getAllBook();

    }

    @GetMapping("get_book_by_id/{id}")
    public GenericBookDto getBookById(@PathVariable Long id) throws BookNotFoundException {
        return bookRackService.getBookById(id);

    }

    @DeleteMapping("delete_book_by_id/{id}")
    public void deleteBookById(@PathVariable Long id) throws BookNotFoundException {
        bookRackService.deleteBookById(id);
    }

    @PutMapping("/update_book_details/{id}")
    public GenericBookDto updateBookDetails(@PathVariable Long id)throws BookNotFoundException{
        return bookRackService.updateBookById(id);
    }


}