//15.	s=1!+2!+3!.........+n! find s
package com.loopassign2;

import java.util.Scanner;

public class S_value {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long fact = 1;
		long sum=0;

		System.out.println("Enter any number:");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			fact *= i;
			sum +=fact;
		}
		System.out.println("Factorial of " + num + " is :" + fact);
		System.out.println("Sum of Factorial " + num + " is :" + sum);
		sc.close();

	}

}
