package com.Revision;

import java.util.Scanner;

public class AcceptCity {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any city name from Pune,Mumbai,Nagpur:");
		String city=sc.next();
		sc.close();
		switch(city)
		{
		case "Pune":
			System.out.println("Pune City Code:MH-12");
			break;
		case "Mumbai":
			System.out.println("Mumbai City Code:MH-01");
			break;
		case "Nagpur":
			System.out.println("Nagpur City Code:MH-31");
			break;
			default :
				System.out.println("City Code:MH-00");
		}
	}

}
