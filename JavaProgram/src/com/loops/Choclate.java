package com.loops;

import java.util.Scanner;

public class Choclate {
	public static void main(String[] args) {
		Scanner cw = new Scanner(System.in);
		System.out.println("Enter how many repees you have:");
		int rupee = cw.nextInt();
		int chocolate = 0;
		int wrappers = 0;
		int exchangedChocolates = 0;
		for (int i = 1; i <= rupee; i++) {

			chocolate++;
			wrappers++;
			System.out.println("Initially bought: " + chocolate + " chocolates");

			if (chocolate % 3 == 0)

			{
				if (wrappers % 3 == 0)
					chocolate++;
				wrappers++;
			}

		}

		System.out.println("Total chocolates: " + (chocolate));
		cw.close();
	}

}
