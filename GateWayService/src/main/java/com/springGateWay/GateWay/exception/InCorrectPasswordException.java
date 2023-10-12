package com.springGateWay.GateWay.exception;

public final class InCorrectPasswordException extends Exception {
    public InCorrectPasswordException() {
        super();
    }

    public InCorrectPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public InCorrectPasswordException(String message) {
        super(message);
    }

    public InCorrectPasswordException(Throwable cause) {
        super(cause);
    }
}
