package com.springGateWay.GateWay.exception;

public final class IncorrectApprovalStatusException extends Exception {
    public IncorrectApprovalStatusException() {
        super();
    }

    public IncorrectApprovalStatusException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectApprovalStatusException(String message) {
        super(message);
    }

    public IncorrectApprovalStatusException(Throwable cause) {
        super(cause);
    }
    
}