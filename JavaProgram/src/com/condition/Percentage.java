package com.condition;

import java.util.Scanner;

public class Percentage {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("Enter the mark of PCM:");
			int PCM = sc.nextInt();
			System.out.println("Enter the mark of Java:");
			int Java = sc.nextInt();
			System.out.println("Enter the mark of Python:");
			int Python = sc.nextInt();
			System.out.println("Enter the mark of Perl:");
			int Perl = sc.nextInt();
			
			double percentage = ((PCM + Java + Python + Perl) /4);
			if (percentage > 90 || PCM>=85)
			{
				System.out.println("Eligible for admission");
			} else
			{
				System.out.println("Not Eligible for admission");
			}
		}
		sc.close();
	}
}
