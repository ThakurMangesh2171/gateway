package com.springGateWay.GateWay.exception;

public final class InvalidRoleNameException extends Exception {
    public InvalidRoleNameException() {
        super();
    }

    public InvalidRoleNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidRoleNameException(String message) {
        super(message);
    }

    public InvalidRoleNameException(Throwable cause) {
        super(cause);
    }
}
