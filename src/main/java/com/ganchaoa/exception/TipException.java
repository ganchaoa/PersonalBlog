package com.ganchaoa.exception;

public class TipException extends RuntimeException{
	
	private static final long serialVersionUID = 7833412829458982989L;

	public TipException() {
		
	}
	
	public TipException(String message) {
		super(message);
	}
	
	public TipException(String message, Throwable cause) {
		super(message, cause);
	}

	public TipException(Throwable cause) {
		super(cause);
	}
}
