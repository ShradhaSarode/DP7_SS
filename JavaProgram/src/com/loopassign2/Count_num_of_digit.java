//8.Write a Java program to count number of digits in any number
package com.loopassign2;

import java.util.Scanner;

public class Count_num_of_digit
{
	static void countDigits(int num)
	{
		int count=0;
		
		do
		{
			num/=10;
			count++;
		}
		while(num!=0);
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any digit number:");
	    int num= sc.nextInt();
		 System.out.println("Number of digits are:");
			countDigits(num);
			sc.close();

	}

}
