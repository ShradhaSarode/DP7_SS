
/*
  Write a Java program to find maximum between three numbers
 */
package com.ifelse;

import java.util.Scanner;

public class Maximumthree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the num1: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter the num2: ");
		int num2 = scanner.nextInt();

		System.out.print("Enter the num3: ");
		int num3 = scanner.nextInt();

		if (num1 > num2) {

			if (num1 > num3) {
				System.out.println(num1 + " is greater");
			} else {
				System.out.println(num3 + " is greater");
			}
		} else {
			if (num2 > num3) {
				System.out.println(num2 + " is greater");
			} else
				System.out.println(num3 + " is greater");
		}
		scanner.close();
	}

}
