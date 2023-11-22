package com.example.demo.exception;

public class InvalidCreditNumberException extends RuntimeException {
	
	String message;
	
 String errorCode;

	public InvalidCreditNumberException(String message) {
		super();
		this.message = message;
	}
	

	public InvalidCreditNumberException(String message, String errorCode) {
		super();
		this.message = message;
		this.errorCode = errorCode;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	
	

}
