//Write a Java program to enter length and breadth of a rectangle and find its perimeter.
package com.assignment1;

import java.util.Scanner;

public class Perimeter_Of_Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the rectangle :  ");
		double length=sc.nextDouble();
		System.out.println("Enter width of the rectangle:   ");
		double width=sc.nextDouble();
		double perimeter_of_rectangle=( length + width ) * 2;
		System.out.println("Perimeter of the rectangle:   " + perimeter_of_rectangle);	
		sc.close();
	}
}