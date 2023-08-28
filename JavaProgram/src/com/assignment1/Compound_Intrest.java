// Write a Java program to enter P, T, R and calculate Compound Interest
package com.assignment1;

import java.util.Scanner;

public class Compound_Intrest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time period in years (T): ");
        double time = scanner.nextDouble();

        System.out.print("Enter the rate of interest (R): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = scanner.nextInt();

        double compoundInterest = principal * Math.pow(1 + (rate / (n * 100)), n * time) - principal;

        System.out.println("Compound Interest: " + compoundInterest);

        scanner.close();

	}

}
