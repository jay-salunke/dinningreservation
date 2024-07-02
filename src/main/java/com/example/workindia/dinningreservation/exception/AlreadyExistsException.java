package com.example.workindia.dinningreservation.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AlreadyExistsException extends RuntimeException {
    String message;
    String fieldValue;



    public AlreadyExistsException(String message, String fieldValue) {
        super(String.format(" : %s : %s",message,fieldValue));

        this.message = message;
        this.fieldValue = fieldValue;

    }
}
