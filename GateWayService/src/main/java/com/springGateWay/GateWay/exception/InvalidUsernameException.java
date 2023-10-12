package com.springGateWay.GateWay.exception;

public final class InvalidUsernameException extends Exception {
    public InvalidUsernameException() {
        super();
    }

    public InvalidUsernameException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidUsernameException(String message) {
        super(message);
    }

    public InvalidUsernameException(Throwable cause) {
        super(cause);
    }
}
