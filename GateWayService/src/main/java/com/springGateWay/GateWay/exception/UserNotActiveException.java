package com.springGateWay.GateWay.exception;

public final class UserNotActiveException extends Exception {
    public UserNotActiveException() {
        super();
    }

    public UserNotActiveException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotActiveException(String message) {
        super(message);
    }

    public UserNotActiveException(Throwable cause) {
        super(cause);
    }
}
