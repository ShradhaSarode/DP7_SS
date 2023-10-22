package com.lab;

import java.util.Scanner;

public class Increasing_decreasing_bouncy_static_method
{
	static int inc(int num)
	{
		int flag=0;
		while(num>0)
		{
			int inc=num%10;
			int temp=num;
			while(temp>0)
			{
				int rem=temp%10;
				if(rem>inc)
				{
					flag=1;
					break;
				}
				temp/=10;
			}
			num/=10;
		}
		
		
		return flag;

	}

	static int decreasing(int num)
	{
		int flag=0;
		while(num>0)
		{
			int dec=num%10;
			int temp=num;
			while(temp>0)
			{
				int rem=temp%10;
				if(rem<dec)
				{
					flag=1;
					break;
				}
				temp/=10;
			}
			num/=10;
		}
		
		
		return flag;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int num = sc.nextInt();
		int a,b;
		a=inc(num);
		
		b=decreasing(num);
		//int flag = 0;
		if(a==0)
		{
			System.out.println("increasing");
		}
		else if(b==0)
		{
			System.out.println("decreasing");
			
		}
		else
		{
			System.out.println("Bouncy num");
		}
		sc.close();
	}

}
