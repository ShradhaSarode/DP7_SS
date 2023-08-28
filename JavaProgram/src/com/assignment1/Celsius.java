//Write a Java program to enter temperature in Fahrenheit(°F) and convert it into Celsius(°C)

package com.assignment1;

import java.util.Scanner;

public class Celsius {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println("Temperature in Celsius: " + celsius);

        scanner.close();
    }
}
