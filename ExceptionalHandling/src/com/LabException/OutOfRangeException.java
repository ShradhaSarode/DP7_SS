package com.LabException;

@SuppressWarnings("serial")
public class OutOfRangeException extends RuntimeException
{
	public OutOfRangeException()
	{
		super();	
	}

	public OutOfRangeException(String message)
	{
		super(message);
	}
	
}
