package com.MLab;

@SuppressWarnings("serial")
public class InvalidStringException extends RuntimeException
{

	public InvalidStringException() {
		super();
		
	}

	public InvalidStringException(String message) {
		super(message);
		
	}
	
}
