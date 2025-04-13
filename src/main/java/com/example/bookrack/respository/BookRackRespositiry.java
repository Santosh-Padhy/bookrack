package com.example.bookrack.respository;

import com.example.bookrack.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRackRespositiry extends JpaRepository<Book,Long> {
 Book  save(Book book);

 List<Book> findAll();
 Book getById(Long id);

 void deleteById(Long id);

}
