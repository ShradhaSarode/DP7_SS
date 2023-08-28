package com.switchstatements;

import java.util.Scanner;

public class Weekdays {
	public static void main(String[] args)
	{
		Scanner wd=new Scanner(System.in);
		System.out.println("Enter any weekday number(1-7)");
		int weekday=wd.nextInt();
		switch(weekday){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thurday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			default :
				System.out.println("error in input");
			
		}
		System.out.println("Welcome to this beautiful day");
		wd.close();
		
	}

		
	}


