//2.	 WAP to print odd numbers from 521 to 229 using while loop. 
package com.loopassign2;

//import java.util.Scanner;

public class Odd_num_add_using_while {

	public static void main(String[] args) {
		int number = 521;
		int sum = 0;
		while (number <= 229) {
			if (number % 2 != 0) {
				//System.out.println(number);
				number += 1;
			}
		}
			System.out.println("Sum of odd number from 229 to 521:" + sum);
		
	}

}
