package com.ssm.exception;

public class UnLoginException extends RuntimeException {
    public UnLoginException(){
        super();
    }

    public UnLoginException(String message) {
        super(message);
    }
}
