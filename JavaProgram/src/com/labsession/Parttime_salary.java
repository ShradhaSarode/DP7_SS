package com.labsession;

import java.util.Scanner;

public class Parttime_salary
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Micky Software Solution!!!!!!!!!");
		System.out.println("Enter num of hour he/she worked:");
		int hour = sc.nextInt();
		double total_amount = hour * 100 * 365;

		System.out.println(total_amount);

		sc.close();
	}

}
