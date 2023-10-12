package com.springGateWay.GateWay.exception;

public final class InvalidCaptchaException extends Exception {
    public InvalidCaptchaException() {
        super();
    }

    public InvalidCaptchaException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCaptchaException(String message) {
        super(message);
    }

    public InvalidCaptchaException(Throwable cause) {
        super(cause);
    }
}