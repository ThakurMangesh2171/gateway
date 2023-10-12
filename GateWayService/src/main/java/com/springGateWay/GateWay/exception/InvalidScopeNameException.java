package com.springGateWay.GateWay.exception;

public final class InvalidScopeNameException extends Exception {
    public InvalidScopeNameException() {
        super();
    }

    public InvalidScopeNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidScopeNameException(String message) {
        super(message);
    }

    public InvalidScopeNameException(Throwable cause) {
        super(cause);
    }
}
