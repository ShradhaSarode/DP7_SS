package com.revision;

import java.util.Scanner;

public class Count_add_digit
{
	static void extract(int num)
	{
		int sum=0;
		while(num!=0)
		{
			System.out.println(num%10);
			num=num/10;
			sum+=num;
		}
	}
	

	public static void main(String[] args)
	{
		//int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any num:");
		
		int num= sc.nextInt();
		extract(num);
		
		//count++;
		sc.close();

	}

}
