package com.ssm.exception;

public class LoginStatusOutOfDateException extends RuntimeException {
    public LoginStatusOutOfDateException() {
        super();
    }

    public LoginStatusOutOfDateException(String message) {
        super(message);
    }
}
