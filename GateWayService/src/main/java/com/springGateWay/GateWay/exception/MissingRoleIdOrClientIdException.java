package com.springGateWay.GateWay.exception;

/**
 * This custom exception can be used whenever empty strings (or) nulls are provided
 * as input for mandatory fields. It can also be used whenever the value of a field
 * does not satisfy the required conditions
 */
public class MissingRoleIdOrClientIdException extends RuntimeException {
    public MissingRoleIdOrClientIdException() { }

    public MissingRoleIdOrClientIdException(String message) {
        super(message);
    }

    public MissingRoleIdOrClientIdException(String message, Throwable cause) {
        super(message, cause);
    }
}

