package com.springGateWay.GateWay.exception;

public final class PermissionNotInsertedException extends Exception {
    public PermissionNotInsertedException() {
        super();
    }

    public PermissionNotInsertedException(String message, Throwable cause) {
        super(message, cause);
    }

    public PermissionNotInsertedException(String message) {
        super(message);
    }

    public PermissionNotInsertedException(Throwable cause) {
        super(cause);
    }
}
