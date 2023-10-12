package com.springGateWay.GateWay.exception;

public final class PasswordInitiationException extends Exception {
    public PasswordInitiationException() {
        super();
    }

    public PasswordInitiationException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordInitiationException(String message) {
        super(message);
    }

    public PasswordInitiationException(Throwable cause) {
        super(cause);
    }
}