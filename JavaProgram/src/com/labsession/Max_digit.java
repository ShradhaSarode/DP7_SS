package com.labsession;

import java.util.Scanner;

public class Max_digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num:");
		int num = sc.nextInt();
		int digit = 0;
		while (num != 0) {
			int rem = num % 10;
			if (rem > digit) {
				digit = rem;
			}
			num /= 10;
		}
		System.out.println("max digit of num :" + digit);
		sc.close();
	}

}
