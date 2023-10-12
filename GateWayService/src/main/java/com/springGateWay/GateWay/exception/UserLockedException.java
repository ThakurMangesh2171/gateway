package com.springGateWay.GateWay.exception;

public final class UserLockedException extends Exception {
    public UserLockedException() {
        super();
    }

    public UserLockedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserLockedException(String message) {
        super(message);
    }

    public UserLockedException(Throwable cause) {
        super(cause);
    }
    
}
