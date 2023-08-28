package com.assignment1;

import java.util.Scanner;

public class Squareroot
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root of " + number + " is " + squareRoot);
        scanner.close();
    }
}




