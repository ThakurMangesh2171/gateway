package com.springGateWay.GateWay.exception;

public final class UserOrMobileAlreadyExistsException extends Exception {
    public UserOrMobileAlreadyExistsException() {
        super();
    }

    public UserOrMobileAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserOrMobileAlreadyExistsException(String message) {
        super(message);
    }

    public UserOrMobileAlreadyExistsException(Throwable cause) {
        super(cause);
    }
}
