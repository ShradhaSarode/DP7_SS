package com.ifelse;

import java.util.Scanner;

public class Divisibleby {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1:");
		int num1 = sc.nextInt();
		
		if (num1%5==0 && num1%11==0) {
			System.out.println(num1 +" is divisible by both 5 and 11");
		} else {
			System.out.println(num1 +" is not divisible by 5 and 11");
		}
		sc.close();
	}

	

}
