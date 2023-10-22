package com.Exception1;

public class TryFinally {

	public static void main(String[] args)
	{
		try
		{
			int a=10;
			System.out.println(a/0);
		}
		finally
		{
			System.out.println("done.......");
		}
	}

}
