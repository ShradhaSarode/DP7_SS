//Write a Java program to enter P, T, R and calculate Simple Interest.

package com.assignment1;

import java.util.Scanner;

public class Simple_Intrest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time period in years (T): ");
        double time = scanner.nextDouble();

        System.out.print("Enter the rate of interest (R): ");
        double rate = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();

	}

}
