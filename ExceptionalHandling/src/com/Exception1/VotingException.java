package com.Exception1;

import java.util.Scanner;

public class VotingException {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int age;
		try
		{
			System.out.println("Enter age:");
			age=sc.nextInt();
			if (age>18)
			{
				System.out.println("you can vote");
			}
			else
			{
				System.out.println("you can not vote");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println(e+": age entered was not in number");
		}
		finally
		{
			sc.close();
			System.out.println("Thanks for voting............");
		}
	}

}
