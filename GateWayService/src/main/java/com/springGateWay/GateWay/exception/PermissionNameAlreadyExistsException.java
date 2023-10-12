package com.springGateWay.GateWay.exception;

public final class PermissionNameAlreadyExistsException extends Exception {
    public PermissionNameAlreadyExistsException() {
        super();
    }

    public PermissionNameAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public PermissionNameAlreadyExistsException(String message) {
        super(message);
    }

    public PermissionNameAlreadyExistsException(Throwable cause) {
        super(cause);
    }
}
