package com.CustomeException;

@SuppressWarnings("serial")
public class InvalidNameException extends RuntimeException
{

	public InvalidNameException() {
		super();
		
	}

	public InvalidNameException(String message) {
		super(message);
		
	}

	

}
