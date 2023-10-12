package com.springGateWay.GateWay.exception;

public final class InvalidPermissionNameException extends Exception {
    public InvalidPermissionNameException() {
        super();
    }

    public InvalidPermissionNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPermissionNameException(String message) {
        super(message);
    }

    public InvalidPermissionNameException(Throwable cause) {
        super(cause);
    }
}
