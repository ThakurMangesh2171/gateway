package com.springGateWay.GateWay.exception;

public final class InvalidPasswordException extends Exception {
    public InvalidPasswordException() {
        super();
    }

    public InvalidPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPasswordException(String message) {
        super(message);
    }

    public InvalidPasswordException(Throwable cause) {
        super(cause);
    }
}