package com.springGateWay.GateWay.exception;

public final class PermissionStillMappedToScopeException extends Exception {
    public PermissionStillMappedToScopeException() {
        super();
    }

    public PermissionStillMappedToScopeException(String message, Throwable cause) {
        super(message, cause);
    }

    public PermissionStillMappedToScopeException(String message) {
        super(message);
    }

    public PermissionStillMappedToScopeException(Throwable cause) {
        super(cause);
    }
}
