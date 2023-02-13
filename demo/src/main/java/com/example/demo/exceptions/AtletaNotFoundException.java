package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND , code = HttpStatus.NOT_FOUND, reason = "atleta non trovato")
public class AtletaNotFoundException extends RuntimeException{

    public AtletaNotFoundException() {
        super();
    }

    public AtletaNotFoundException(String message) {
        super(message);
    }

    public AtletaNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public AtletaNotFoundException(Throwable cause) {
        super(cause);
    }
}
