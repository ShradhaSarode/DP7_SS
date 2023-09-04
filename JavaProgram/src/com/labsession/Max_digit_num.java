package com.labsession;

import java.util.Scanner;

public class Max_digit_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit number:");
		int num = sc.nextInt();
		int digit=0;
		do {
			int rem =num%10;
			if(rem>digit)
			{
				digit=rem;
			}
			num /= 10;
			
		} while (num != 0);
		
		System.out.println("Max digit is:"+digit);
		sc.close();

	}

}
