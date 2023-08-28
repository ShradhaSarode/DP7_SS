package com.switchstatements;

import java.util.Scanner;

public class Pg_admission {
	public static void main(String[] args) {
		Scanner pg = new Scanner(System.in);
		System.out.println("Enter stream:");
		String stream = pg.next();
		System.out.println("Enter your percentage");
		double percentage = pg.nextDouble();

		switch (stream) {
		case "MBA":
			System.out.println(stream + " :1.MBA-IT\n" + "2.MBA-Finance\n" + "3.MBA-HR\n" + "4.Marketing\n");
			
		case "MCA":
			System.out.println(
					stream + " :1.MCA-Java Programming\n" + "2.MCA-CloudComputing\n" + "3.MCA-FinancialAccounting\n");
			
			
			System.out.println("Enter your choice");
			int choice = pg.nextInt();

			switch (choice) {
			case 1:
				if(percentage>=75)
				System.out.println("You get admisson for MBA");
				break;
			

			case 2:
				if(percentage<=70)
				System.out.println("You get admission for MCA");
				break;
				
				default:
					System.out.println("You entered wrong choice Better luck next time");
			}
		}
		pg.close();
	}
}
