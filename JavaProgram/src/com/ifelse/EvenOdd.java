// Write a Java program to check whether a number is even or odd 
package com.ifelse;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1:");
		int num1 = sc.nextInt();
		if (num1 % 2 == 0) {
			System.out.println("num1 is even ");
		} else {
			System.out.println("num1 is odd");
		}
		sc.close();
	}

}
