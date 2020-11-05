package com.exceptions;

public class InvalidAccountException extends Exception{
    public InvalidAccountException(String MSG) {
        super(MSG);
    }
}
