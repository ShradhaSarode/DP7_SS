//Write a Java program to enter length and breadth of a rectangle and find its area.
package com.assignment1;

import java.util.Scanner;

public class Area_of_Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the rectangle :  ");
		double length=sc.nextDouble();
		System.out.println("Enter width of the rectangle:   ");
		double width=sc.nextDouble();
		double area_of_rectangle = length * width ;
		System.out.println("Area of the rectangle:   " + area_of_rectangle);	
		sc.close();
	}

}
