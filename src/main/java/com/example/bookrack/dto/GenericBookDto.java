package com.example.bookrack.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericBookDto {
    private Long id;
    private String bookName;
    private Long bookPrice;
}
