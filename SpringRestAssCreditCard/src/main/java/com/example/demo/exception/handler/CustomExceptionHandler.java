package com.example.demo.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.exception.InvalidCreditNumberException;
import com.example.demo.model.ErrorResponse;

@ControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(InvalidCreditNumberException.class)
	public ResponseEntity<ErrorResponse> productNotFoundHandler(InvalidCreditNumberException invalidCreditNumberException){
		ErrorResponse errorResponse=ErrorResponse.builder()
				.errorCode(invalidCreditNumberException.getErrorCode())
				.errorMessage(invalidCreditNumberException.getMessage())
				.build();
		return new ResponseEntity<>(errorResponse,HttpStatus.EXPECTATION_FAILED);
	}

}
