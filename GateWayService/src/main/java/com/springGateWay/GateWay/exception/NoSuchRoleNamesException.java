package com.springGateWay.GateWay.exception;

public final class NoSuchRoleNamesException extends Exception {
    public NoSuchRoleNamesException() {
        super();
    }

    public NoSuchRoleNamesException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchRoleNamesException(String message) {
        super(message);
    }

    public NoSuchRoleNamesException(Throwable cause) {
        super(cause);
    }
}
