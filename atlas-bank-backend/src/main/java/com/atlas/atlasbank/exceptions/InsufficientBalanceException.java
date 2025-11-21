package com.atlas.atlasbank.exceptions;

public class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(String error){
        super(error);
    }
}