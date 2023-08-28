/*
 Write a Java program to input electricity consumption unit and calculate totalelectricity billaccording to the given 
condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit 
above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill
 */
package com.ifelse;

import java.util.Scanner;

public class Electricity_Bill
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter electricity consumption in units: ");
		int units = scanner.nextInt();
		double totalBill = 0;

		if (units <= 50)
		{
			totalBill = units * 0.50;
		} else if (units <= 150)
		{
			totalBill = 50 * 0.50 + (units - 50) * 0.75;
		} else if (units <= 250)
		{
			totalBill = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
		} else
		{
			totalBill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
		}
		
		// Adding 20% surcharge
		totalBill += totalBill * 0.20;
		System.out.println("Total Electricity Bill: Rs. " + totalBill);
		scanner.close();
	}
}
