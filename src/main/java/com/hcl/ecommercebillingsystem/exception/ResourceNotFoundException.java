package com.hcl.ecommercebillingsystem.exception;

/**
 * Created by Vu Linh
 * Created date: 10/04/2022
 */
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
