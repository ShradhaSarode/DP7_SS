//Write a Java program to convert days into years, weeks and days.
/*
 Number of year = (number of days) / 365.
 Number of weeks = (number of days % 365) / 7.
 Number of days = (number of days % 365) % 7.
 */
package com.assignment1;

import java.util.Scanner;

public class Year_Weeks_Days {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no_of_days: ");
		int no_of_days = sc.nextInt();
		int no_of_year = no_of_days / 365;
		int no_of_weeks = (no_of_days % 365) / 7;
		int days = (no_of_days % 365) % 7;
		System.out.println("no_of_year:" + no_of_year);
		System.out.println("no_of_weeks:" + no_of_weeks);
		System.out.println("Days:" + days);
		sc.close();
	}
}