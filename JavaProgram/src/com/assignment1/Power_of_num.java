//Write a Java program to find power of any number x ^ y
package com.assignment1;

import java.util.Scanner;

public class Power_of_num {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the base value of x:");
	int x = sc.nextInt();
	System.out.println("Enter the exponent value of y:");
	int y = sc.nextInt();
	int power = x^y;
	System.out.println("Power:"+power);
	sc.close();
}
}
