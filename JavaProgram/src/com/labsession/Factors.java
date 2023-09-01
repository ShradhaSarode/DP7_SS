package com.labsession;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//int fact=sc.nextInt();
		System.out.println("Enter any number:");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++)
		{
			if (num % i == 0)
			{
			System.out.println("Factors of " + num + " is :" + i);
			}
		}
          sc.close();
	}

}
