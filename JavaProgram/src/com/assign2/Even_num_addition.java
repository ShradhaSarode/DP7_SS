//WAP to print even numbers from 121 to 229 using for loop. 
package com.assign2;

import java.util.Scanner;

public class Even_num_addition
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
//		System.out.println("first num:");
//		int first = sc.nextInt();
//		System.out.println("last num:");
//		int last = sc.nextInt();
		int sum = 0;
		for (int i = 121; i <= 229; i++)
		{

			if (i % 2 == 0)
			{
				sum += i;
			}
		}
		System.out.println("Sum of even number from 121 to 229:" + sum);
		sc.close();
	}

}
