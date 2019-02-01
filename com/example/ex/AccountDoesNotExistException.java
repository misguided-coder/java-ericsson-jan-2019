package com.example.ex;

public class AccountDoesNotExistException extends Exception {

	public AccountDoesNotExistException() {
	}
	
	public AccountDoesNotExistException(String message) {
		super(message);
	}
	
}
