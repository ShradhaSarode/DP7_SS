package com.ifelse;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition\n"
		                 + "2.Substraction\n"
				         + "3.Multiplication\n"
		                 + "4.Division");
		System.out.println("Enter any choice from 1 to 4:");
		int choice = sc.nextInt();
		System.out.println("Enter the value of num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the value of num2:");
		int num2 = sc.nextInt();

		if (choice == 1)
		{
			double addition = 0;
			System.out.println("Addition:" + (addition = num1 + num2));
		}
		else if (choice == 2)
		{
			double subtraction = 0;
			System.out.println("Subtraction:" + (subtraction = num1 - num2));
		}
		else if (choice == 3)
		{
			double multiplication = 0;
			System.out.println("Multiplication:" + (multiplication = num1 * num2));
		}
		else if (choice == 4)
		{
			double division = 0;
			System.out.println("Division:" + (division = num1 / num2));
		}
		sc.close();
	}
}
