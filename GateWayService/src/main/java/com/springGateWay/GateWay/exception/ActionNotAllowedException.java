package com.springGateWay.GateWay.exception;

public final class ActionNotAllowedException extends Exception {
    public ActionNotAllowedException() {
        super();
    }

    public ActionNotAllowedException(String message, Throwable cause) {
        super(message, cause);
    }

    public ActionNotAllowedException(String message) {
        super(message);
    }

    public ActionNotAllowedException(Throwable cause) {
        super(cause);
    }
}
