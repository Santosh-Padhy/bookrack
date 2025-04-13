package com.example.bookrack.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ExceptionDto {
    private HttpStatus httpStatus;
    private String message;
}
