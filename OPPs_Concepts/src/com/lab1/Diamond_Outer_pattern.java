package com.lab1;

import java.util.Scanner;

public class Diamond_Outer_pattern {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number of rows:");
		int n= sc.nextInt();
		
		System.out.println("-----------------------------");
		
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			// for spaces
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			//for numbers
			for(int j=1;j<=i;j++)
			{
				if(j==1 || j==2*i-1)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("");
				}
			}
			
			System.out.println();
		}
		
		for(int i=n-1;i>=1;i--)
		{
			// for spaces
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			//for numbers
			for(int j=1;j<=i;j++)
			{
				if(j==1 || j==2*i-1)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("");
				}
			}
			
			System.out.println();
		}
		sc.close();
	}

}
