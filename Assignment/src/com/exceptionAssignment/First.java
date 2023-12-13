package com.exceptionAssignment;
/*
 WAP which throws ArrayIndexOutBoundsException. In the console, observe the stack trace and the 
line number from where the Exception is thrown
 */
public class First
{
	public static void main(String[] args)
	{
		try {
			int[] numbers = { 1, 2, 3 };
			int element = numbers[5];
		} catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}
}
