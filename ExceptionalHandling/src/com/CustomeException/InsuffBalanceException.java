package com.CustomeException;

@SuppressWarnings("serial")
public class InsuffBalanceException extends RuntimeException
{
	public InsuffBalanceException()
	{
		super();	
	}
	public InsuffBalanceException(String message)
	{
		super(message);		
	}
}
