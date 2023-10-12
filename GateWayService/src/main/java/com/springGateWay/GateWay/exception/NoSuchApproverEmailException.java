package com.springGateWay.GateWay.exception;


public final class NoSuchApproverEmailException  extends Exception {
    public NoSuchApproverEmailException() {
        super();
    }

    public NoSuchApproverEmailException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchApproverEmailException(String message) {
        super(message);
    }

    public NoSuchApproverEmailException(Throwable cause) {
        super(cause);
    }
}
