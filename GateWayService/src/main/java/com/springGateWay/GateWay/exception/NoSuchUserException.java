package com.springGateWay.GateWay.exception;

public final class NoSuchUserException extends Exception {
    public NoSuchUserException() {
        super();
    }

    public NoSuchUserException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchUserException(String message) {
        super(message);
    }

    public NoSuchUserException(Throwable cause) {
        super(cause);
    }
}
