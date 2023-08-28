package com.operators;

import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of person:");
		String name = sc.next();
		System.out.println("Enter the age of person:");
		int age = sc.nextInt();
		System.out.println("Enter the height of person:");
		float height = sc.nextFloat();
		System.out.println("Enter the gender of person:");
		char gender = sc.next().charAt(0);
		System.out.println("name " + name + " age is " + age + " height is " + height + " gender is " + gender);

		sc.close();
	}

}
