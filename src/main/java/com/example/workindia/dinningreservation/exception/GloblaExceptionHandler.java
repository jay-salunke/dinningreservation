package com.example.workindia.dinningreservation.exception;

import com.example.workindia.dinningreservation.payloads.APIResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GloblaExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<APIResponse> resourceNotFoundException(ResourceNotFoundException ex) {
        String message = ex.getMessage();
        return new ResponseEntity<>(new APIResponse(message, false, HttpStatus.NOT_FOUND.toString()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(AlreadyExistsException.class)
    public ResponseEntity<APIResponse> userAlreadyExistsException(AlreadyExistsException ex){
        String message = ex.getMessage();
        return new ResponseEntity<>(new APIResponse(message,false,HttpStatus.OK.toString()),HttpStatus.OK);
    }
}
