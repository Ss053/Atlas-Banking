package com.atlas.atlasbank.exceptions;

public class NotFoundException  extends RuntimeException{
    public NotFoundException(String error){
        super(error);
    }
}
