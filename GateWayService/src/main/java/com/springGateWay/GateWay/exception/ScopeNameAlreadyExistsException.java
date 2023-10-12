package com.springGateWay.GateWay.exception;

public final class ScopeNameAlreadyExistsException extends Exception {
    public ScopeNameAlreadyExistsException() {
        super();
    }

    public ScopeNameAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ScopeNameAlreadyExistsException(String message) {
        super(message);
    }

    public ScopeNameAlreadyExistsException(Throwable cause) {
        super(cause);
    }
}
