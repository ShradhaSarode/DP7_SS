package com.exception;

public class Rethrow
{
	static void method1()
	{
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException ex)
		{
			System.out.println("In catch block of method 1");
			throw ex;
		}
	}
	
	public static void main(String[] args) {
		
		try
		{
			method1();
		}
		catch(NullPointerException e)
		{
			System.out.println("In main:"+e);
			//throw e;
		}
		
	}



}
