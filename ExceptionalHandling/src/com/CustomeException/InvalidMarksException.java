package com.CustomeException;

@SuppressWarnings("serial")
public class InvalidMarksException extends RuntimeException
{

	public InvalidMarksException()
	{
		super();
		
	}

	public InvalidMarksException(String message)
	{
		super(message);
		
	}
	
}
