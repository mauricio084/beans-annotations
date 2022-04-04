package com.javeriana.desarrolloweb.exceptions;

@SuppressWarnings("serial")
public class GeneralException extends RuntimeException {

	public GeneralException(String message) {
		super(message);
	}
	
	public GeneralException(Throwable cause) {
		super(cause.getMessage(), cause);
	}
}



