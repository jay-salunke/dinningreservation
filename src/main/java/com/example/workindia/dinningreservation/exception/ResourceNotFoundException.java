package com.example.workindia.dinningreservation.exception;

public class ResourceNotFoundException extends RuntimeException{

    private String resourceName;
    private String fieldName;

    private String fieldValue;

    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue){
        super(String.format("%s resource not found with  %s : %s",resourceName,fieldName,fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
}
