//Write a Java program to input any character and check whether it is alphabet, digit or special character
package com.ifelse;

import java.util.Scanner;

public class CharDigSpl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any char:");
		char ch = sc.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is in A to Z");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " is in 0 to  9");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is in a to z");
		}else 
			System.out.println("Special character");

		sc.close();
	}
}
