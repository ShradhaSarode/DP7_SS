package com.loops;

import java.util.Scanner;

public class Forsample {
	public static void main(String[] args) {

		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		Scanner ft = new Scanner(System.in);
		System.out.println("Enter the num to print in table:");
		int num = ft.nextInt();
		for (int j = 1; j <= 10; j++) {
			System.out.println(num + "x" + j + "=" + (num * j));
		}
		ft.close();
	}

}
