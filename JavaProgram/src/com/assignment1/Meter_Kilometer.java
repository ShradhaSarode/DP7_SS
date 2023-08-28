//. Write a Java program to enter length in centimeter and convert it into meter and kilometer.
package com.assignment1;

import java.util.Scanner;

public class Meter_Kilometer {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length in centimeters: ");
        double centimeters = scanner.nextDouble();

        double meters = centimeters / 100;
        double kilometers = centimeters / 100000;

        System.out.println("Length in meters: " + meters);
        System.out.println("Length in kilometers: " + kilometers);

        scanner.close();
    }

}
