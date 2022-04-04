package com.javeriana.desarrolloweb.controller;

import org.springframework.http.HttpStatus;

public class ErrorCode {
	String message;
	int httpCode;
	
	public ErrorCode(HttpStatus httpCode, String message) {
		this.httpCode = httpCode.value();
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	public int getHttpCode() {
		return httpCode;
	}
}