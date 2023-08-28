//Write a Java program to enter radius of a circle and find its diameter, circumference and area.

package com.assignment1;

import java.util.Scanner;

public class Area_of_circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle :  ");
		double radius=sc.nextDouble();
		
		double diameter= 2 * radius;
		double circumference= 2 * Math.PI * radius;
		double area_of_circle=( Math.PI * radius * radius);
		System.out.println("Diameter of circle :" + diameter);
		System.out.println("Circumference of circle:" + circumference);
	    System.out.println("Area of circle:" + area_of_circle);		
		sc.close();
	}


}
