//Write a Java program to enter two numbers and find their sum.
package com.assignment1;

import java.util.Scanner;

public class Sum2num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the value of num2:");
		int num2 = sc.nextInt();
		int sum = num1+num2;
		System.out.println("Sum:"+sum);
		sc.close();
	}

}
