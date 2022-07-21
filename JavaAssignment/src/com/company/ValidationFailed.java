package com.company;

public class ValidationFailed extends RuntimeException{
    public ValidationFailed(String s){
        super(s);
    }
}
