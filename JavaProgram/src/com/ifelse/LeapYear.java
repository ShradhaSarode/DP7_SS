// Write a Java program to check whether a year is leap year or not
package com.ifelse;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		
		if (year%4==0 && year%100!=0) {
			System.out.println(year+ " is leap");
		} 
		else if(year%100==0 && year%400==0)
		{
			System.out.println(year+ " is leap");
		}
		else
		{
			System.out.println(year+" is not leap");
		}
		sc.close();
	}

}
