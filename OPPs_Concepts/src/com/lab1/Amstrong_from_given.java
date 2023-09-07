package com.lab1;

import java.util.Scanner;

public class Amstrong_from_given
{
	static void checkArmstrong(int num)
	{
		int n1=num;
		int n2=num;
		int count=0;
		while(num!=0)
		{
			num/=10;
			count ++;
		}
		int sum=0;
		while(n1!=0)
		{
			int pow=1;
			int rem=n1%10;
			for(int i=1;i<=count;i++)
			{
				pow=pow*rem;
			}
			sum+=pow;
			n1/=10;
		}
		if(sum==n2)
			System.out.println(sum);
	}
		
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
		System.out.println("Amstrong num from 1 to 1500:");
		for(int i=1;i<=1500;i++)
		{
		checkArmstrong(i);
		}
		//sc.close();
	
	}

}
