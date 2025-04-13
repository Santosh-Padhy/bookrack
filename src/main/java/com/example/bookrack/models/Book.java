package com.example.bookrack.models;

import com.example.bookrack.dto.GenericBookDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Book extends BaseModel{
    private String bookName;
    private Long bookPrice;



//    public static GenericBookDto from (Book book){
//        GenericBookDto genericBookDto = new GenericBookDto();
//        genericBookDto.setBookName(book.getBookName());
//        genericBookDto.setBookPrice(book.getBookPrice());
//         return genericBookDto;
//    }
}
