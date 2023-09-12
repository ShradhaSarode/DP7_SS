package com.revision;

import java.util.Scanner;

public class Natural_num {

	public static void main(String[] args)
	{
		int sum_Natural_num=0;
		Scanner nc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = nc.nextInt();
		for(int i=0;i<=n;i++)
		{
		/*
		 
		n(n+1)(2n+1)/6
		 
		 */
		
		 sum_Natural_num=(n*(n+1)*(2*n+1))/6;
		}
		System.out.println("Sum of n naturals numbers:"+sum_Natural_num);
        nc.close();
		
	}

}
