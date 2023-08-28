package com.loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
			Scanner ft = new Scanner(System.in);
			long fact=1;
			System.out.println("Enter the num:");
			int num = ft.nextInt();
			for (int i = 1; i <=num; i++)
			{

				fact *=i;
			}
			System.out.println("Factorial of "+num+" is:"+fact);
			System.out.println("=============");
			System.out.println("Enter the num:");
			int num1 = ft.nextInt();
			long fact1=1;
			for (int i = num1; i >0; i--)
			{

				fact1 *=i;
			}
			System.out.println("Factorial of "+num1+" is:"+fact1);
	}

}
