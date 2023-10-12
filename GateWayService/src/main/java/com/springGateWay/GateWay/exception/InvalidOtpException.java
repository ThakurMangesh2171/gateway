package com.springGateWay.GateWay.exception;

public final class InvalidOtpException extends Exception {
    public InvalidOtpException() {
        super();
    }

    public InvalidOtpException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidOtpException(String message) {
        super(message);
    }

    public InvalidOtpException(Throwable cause) {
        super(cause);
    }
}