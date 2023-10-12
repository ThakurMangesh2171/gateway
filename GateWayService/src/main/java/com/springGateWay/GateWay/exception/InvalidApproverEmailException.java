package com.springGateWay.GateWay.exception;

public final class InvalidApproverEmailException extends Exception {
    public InvalidApproverEmailException() {
        super();
    }

    public InvalidApproverEmailException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidApproverEmailException(String message) {
        super(message);
    }

    public InvalidApproverEmailException(Throwable cause) {
        super(cause);
    }
}
