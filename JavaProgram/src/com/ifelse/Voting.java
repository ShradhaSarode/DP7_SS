package com.ifelse;

import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of person:");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("You can vote");
		} else {
			System.out.println("You can not vote");
		}

		sc.close();
	}

}
