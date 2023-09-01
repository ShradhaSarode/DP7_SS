//Write a Java program to check whether a number is even or odd using switch case 
package com.assignment1;

import java.util.Scanner;

public class Switch_Even_Odd
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num:");
		int num = sc.nextInt();
		switch (num % 2)
		{
		case 0:
			System.out.println(num + ":Number is even");
			break;
		case 1:
			System.out.println(num + ":Number is odd");
			break;
		}
		sc.close();
	}

}
