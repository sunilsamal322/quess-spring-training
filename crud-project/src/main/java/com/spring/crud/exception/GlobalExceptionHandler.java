package com.spring.crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ExceptionResponse> studentNotFoundExceptionHandler(StudentNotFoundException exception)
    {
        return new ResponseEntity<>(new ExceptionResponse(exception.getMessage(), false, Instant.now()), HttpStatus.NOT_FOUND);
    }
}
