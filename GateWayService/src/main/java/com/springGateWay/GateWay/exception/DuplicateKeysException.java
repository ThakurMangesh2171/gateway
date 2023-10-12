package com.springGateWay.GateWay.exception;

public final class DuplicateKeysException extends Exception {

	public DuplicateKeysException() {
        super();
    }

    public DuplicateKeysException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateKeysException(String message) {
        super(message);
    }

    public DuplicateKeysException(Throwable cause) {
        super(cause);
    }
}
