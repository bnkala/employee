package com.employee;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
public class ResourceNotFoundException extends RuntimeException{
    private static final Long serialVersionUUID = 1L;

    public ResourceNotFoundException(String message){
        super(message);
    }
}
