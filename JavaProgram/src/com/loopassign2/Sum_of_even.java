//6.Write a Java program to find sum of all even numbers between 1 to n. 
package com.loopassign2;

import java.util.Scanner;

public class Sum_of_even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
	    int n= sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++)
		{

			if (i % 2 == 0)
			{
				sum += i;
			}
		}
		System.out.println("Sum of even number from 1 to n:" + sum);
		sc.close();
	}

}
