//Write a Java program to input any alphabet and check whether it is vowel or consonant
package com.ifelse;

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any alphabet:");
		char alphabet = sc.next().charAt(0);

		if (alphabet == 'a' || alphabet == 'e' || 
			alphabet == 'i' || alphabet == 'o' ||
			alphabet == 'u' || alphabet == 'A' ||
			alphabet == 'E' || alphabet == 'I' ||
			alphabet == 'O' || alphabet == 'U')
		{
			System.out.println(alphabet + " is vowel");
		} else {
			System.out.println(alphabet + " is consonant");
		}
		sc.close();
	}
}
