package com.labsession;

import java.util.Scanner;

public class Calculator_do_switch {

	public static void main(String[] args) {
		
		char ch1;
		System.out.println("1.Addition\n" + "2.Substraction\n" + "3.Multiplication\n" + "4.Division");
		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter any choice from 1 to 4:");
			int choice = sc.nextInt();
			System.out.println("Enter the value of num1:");
			int num1 = sc.nextInt();
			System.out.println("Enter the value of num2:");
			int num2 = sc.nextInt();

			switch (choice)

			{
			case 1:

				System.out.println("Addition:" + (num1 + num2));
				break;
			case 2:

				System.out.println("Subtraction:" + (num1 - num2));
				break;
			case 3:

				System.out.println("Multiplication:" + (num1 * num2));
				break;
			case 4:

				System.out.println("Division:" + (num1 / num2));
				break;
			default:
				System.out.println("you select wrong choice");

			}
			System.out.println("Do u want to continue then press y or n:");
		    ch1=sc.next().charAt(0);
		}
		while (ch1 != 'n');
		System.out.println("Exit");
		// sc.close();
		
	}

}
