//Write a Java program to calculate area of an equilateral triangle.
package com.assignment1;

import java.util.Scanner;

public class Equilateral_triangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the equilateral triangle: ");
        double sideLength = scanner.nextDouble();

        double area = (Math.sqrt(3) / 4) * sideLength * sideLength;
        System.out.println("The area of the equilateral triangle is: " + area);

        scanner.close();

	}

}
