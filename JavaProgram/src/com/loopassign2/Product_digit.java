//Write a Java program to calculate product of digits of any number.
package com.loopassign2;

import java.util.Scanner;

public class Product_digit
{
	static void productDigits(int num)
	{
		int product=1;
		
		do
		{
			int r= num%10;
			num/=10;
			product*=r;
			System.out.println(product);
		}
		while(num!=0);
		System.out.println("------------------------");
		System.out.println(product);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any digit number:");
	    int num= sc.nextInt();
		 System.out.println("Product of digit is:");
			productDigits(num);
			sc.close();
		
	}

}
