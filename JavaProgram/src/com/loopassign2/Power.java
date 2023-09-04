//14.WAP to accept base and index from user and calculates power
package com.loopassign2;

import java.util.Scanner;

public class Power {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the base value:");
		double base = sc.nextDouble();
		System.out.println("Enter the index value:");
		double index = sc.nextDouble();
		double power= Math.pow(base, index);
		
		System.out.println("Power of given base & index value:" + power);
		sc.close();
		
	}

}
