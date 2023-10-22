package com.CustomeException;

@SuppressWarnings("serial")
public class InvalidAgeException extends RuntimeException
{

	public InvalidAgeException() {
		super();
		
	}

	public InvalidAgeException(String age) {
		super(age);
		
	}
	
}
