package com.maddy.hotel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.maddy.hotel.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException ex) {
		String message = ex.getMessage();
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setStatus(false);
		apiResponse.setHttpStatus(HttpStatus.NOT_FOUND);
		apiResponse.setMessage(message);

		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
	}

}
