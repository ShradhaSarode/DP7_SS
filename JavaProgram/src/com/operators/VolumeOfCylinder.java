package com.operators;

import java.util.Scanner;

public class VolumeOfCylinder {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		double radius, height, VolumeOfCylinder;

		System.out.println("Enter the radius:");

		radius = sc.nextDouble();
		System.out.println("Enter the height:");

		height = sc.nextDouble();

		VolumeOfCylinder = Math.PI * radius * radius * height;

		System.out.println("VolumeOfCylinder is:" + VolumeOfCylinder);

		sc.close();

	}

}
