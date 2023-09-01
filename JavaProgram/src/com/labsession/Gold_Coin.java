package com.labsession;

import java.util.Scanner;

public class Gold_Coin
{

	public static void main(String[] args)
	{
		Scanner gc = new Scanner(System.in);
		System.out.println("Enter name of girl:");
		String name = gc.next();
		System.out.println("Enter birthday year:");
		
		int year=gc.nextInt();
		for (int i = 1; i <= year; i++)
		{
			int coin=year*year*year;
			
			System.out.println("On"+ year+" birthday " + name + " got " + coin);
		}
		gc.close();

	}

}
