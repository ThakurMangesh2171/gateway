package com.springGateWay.GateWay.exception;

public final class RoleNameAlreadyExistsException extends Exception {
    public RoleNameAlreadyExistsException() {
        super();
    }

    public RoleNameAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public RoleNameAlreadyExistsException(String message) {
        super(message);
    }

    public RoleNameAlreadyExistsException(Throwable cause) {
        super(cause);
    }
}
