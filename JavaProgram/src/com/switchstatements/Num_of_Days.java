package com.switchstatements;

import java.util.Scanner;

public class Num_of_Days {
	public static void main(String[] args) {
		Scanner nd = new Scanner(System.in);
		System.out.println("Enter any month_name(lower case)");
		String month_name = nd.next();
		switch (month_name) {
		case "jan":

		case "mar":

		case "may":

		case "jul":

		case "aug":

		case "oct":
		case "dec":
			System.out.println("31 days");
			break;
		case "april":
		case "jun":
		case "sept":
		case "nov":
			System.out.println("30 days");
			break;
		case "feb":
			System.out.println("enter the year");
			int year=nd.nextInt();
			if((year%4==0 || year%400!=0)&&(year%100==0))
			{
				System.out.println("29 days");
			}
			else
			{
				System.out.println("28 days");
			}
			break;

		default:
			System.out.println("error in input");

		}
		System.out.println("Welcome to this beautiful month");
		nd.close();

	}

}
