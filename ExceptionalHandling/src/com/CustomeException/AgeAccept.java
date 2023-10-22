package com.CustomeException;

import java.util.Scanner;

public class AgeAccept {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age:");
		int age=sc.nextInt();
		sc.close();
		try
		{
			if(age>18)
			{
				throw new InvalidNameException("valid age to vote");
			}
			System.out.println("Age"+age);
		}
		catch(InvalidNameException e)
		{
			System.out.println(e);
		}
	}

}
