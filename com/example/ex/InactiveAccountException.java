package com.example.ex;

public class InactiveAccountException extends Exception {

	public InactiveAccountException() {
	}
	
	public InactiveAccountException(String message) {
		super(message);
	}
	
}
