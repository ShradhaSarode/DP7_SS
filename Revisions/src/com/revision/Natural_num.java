package com.revision;

import java.util.Scanner;

public class Natural_num {

	public static void main(String[] args) {
		Scanner nc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = nc.nextInt();
		/*
		 
		n(n+1)(2n+1)/6
		 
		 */
		
		//int sum_Natural_num=(n*(n+1)*(2n+1))/6;
		
		System.out.println("Sum of n naturals numbers:"+n);
        nc.close();
	}

}
