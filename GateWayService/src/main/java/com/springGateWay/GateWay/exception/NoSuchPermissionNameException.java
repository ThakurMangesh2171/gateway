package com.springGateWay.GateWay.exception;

public final class NoSuchPermissionNameException extends Exception {
    public NoSuchPermissionNameException() {
        super();
    }

    public NoSuchPermissionNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchPermissionNameException(String message) {
        super(message);
    }

    public NoSuchPermissionNameException(Throwable cause) {
        super(cause);
    }
}
