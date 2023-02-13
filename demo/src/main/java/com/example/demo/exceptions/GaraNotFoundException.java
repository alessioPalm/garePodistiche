package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND , code = HttpStatus.NOT_FOUND, reason = "gara non trovato")
public class GaraNotFoundException extends RuntimeException{

    public GaraNotFoundException() {
        super();
    }

    public GaraNotFoundException(String message) {
        super(message);
    }

    public GaraNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public GaraNotFoundException(Throwable cause) {
        super(cause);
    }

}
