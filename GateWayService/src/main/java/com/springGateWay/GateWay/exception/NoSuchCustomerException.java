package com.springGateWay.GateWay.exception;

public class NoSuchCustomerException extends Exception{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoSuchCustomerException() {
	        super();
	    }

	    public NoSuchCustomerException(String message, Throwable cause) {
	        super(message, cause);
	    }

	    public NoSuchCustomerException(String message) {
	        super(message);
	    }

	    public NoSuchCustomerException(Throwable cause) {
	        super(cause);
	    }

}
