package com.exception;

public class InsufficientBalanceException extends RuntimeException {

	public InsufficientBalanceException() {
		super();
	}

	public InsufficientBalanceException(String message) {
		super(message);
	}

}
