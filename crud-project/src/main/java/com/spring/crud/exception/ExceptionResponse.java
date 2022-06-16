package com.spring.crud.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@AllArgsConstructor
@Getter
@Setter
public class ExceptionResponse {

    private String message;
    private boolean success;
    private Instant timeStamp;
}

