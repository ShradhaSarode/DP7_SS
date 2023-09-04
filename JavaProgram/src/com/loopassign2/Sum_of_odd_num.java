package com.loopassign2;

import java.util.Scanner;

public class Sum_of_odd_num {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
	    int n= sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++)
		{
			if (i % 2 != 0)
			{
				sum += i;
			}
		}
		System.out.println("Sum of odd number from 1 to n:" + sum);
		sc.close();

	}

}
