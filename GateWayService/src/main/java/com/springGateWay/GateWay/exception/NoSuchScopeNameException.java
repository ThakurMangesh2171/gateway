package com.springGateWay.GateWay.exception;

public final class NoSuchScopeNameException extends Exception {
    public NoSuchScopeNameException() {
        super();
    }

    public NoSuchScopeNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchScopeNameException(String message) {
        super(message);
    }

    public NoSuchScopeNameException(Throwable cause) {
        super(cause);
    }
}
