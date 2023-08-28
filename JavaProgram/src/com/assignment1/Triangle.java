// Write a Java program to enter two angles of a triangle and find the third angle.

package com.assignment1;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner op = new Scanner(System.in);

		System.out.print("Enter First angles of triangle: ");
		int a = op.nextInt();
		System.out.print("Enter Second angles of triangle: ");
		int b = op.nextInt();

		int c = 180 - (a + b);

		System.out.println("Third angle of the triangle = " + c);
		op.close();
	}

}
