package com.labsession;

import java.util.Scanner;

public class Countnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("first num:");
		int first=sc.nextInt();
		System.out.println("last num:");
		int last=sc.nextInt();
		int sum = 0;
		for (int i = first; i <= last; i--) {

			if (i %  2!= 0)
			{
				sum += i;
			}
		}
		System.out.println("Sum of odd number is:" + sum);
sc.close();

	}

}
