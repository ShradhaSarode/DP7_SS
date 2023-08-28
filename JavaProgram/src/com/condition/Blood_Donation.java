package com.condition;

import java.util.Scanner;

public class Blood_Donation {
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter age of person: ");
		int age = scanner.nextInt();
		
		if(age>=18)
		{
			System.out.println("Enter your gender");
			char gender=scanner.next().charAt(0);
			if(gender=='M')
			System.out.print("Enter weight of person: ");
			int weight = scanner.nextInt();
			if(weight>=65)
			{
				System.out.println("eligible to donate");
			
			}
			else
			{
				System.out.println("you are under weight");
			}
		}
			else
			{
				System.out.println("you are age does not match");
			}
			
		
		scanner.close();
	}

}
