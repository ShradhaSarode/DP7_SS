package com.LabException;

import java.util.Scanner;

public class ExceptionDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any digit:");
		int digit=sc.nextInt();
		//sc.close();
		try
		{
			if(digit>99999)
			{
				throw new OutOfRangeException("range should be greater than 999999");
			}
			System.out.println("Digit: "+digit);
		}
		catch(OutOfRangeException e)
		{
			System.out.println(e);
		}
	}
}
