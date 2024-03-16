package com.electify.exceptions.customs;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ModularException extends RuntimeException {
    private final HttpStatus status;
    public ModularException(String message, HttpStatus httpStatus) {
        super(message);
        status = httpStatus;
    }
}
