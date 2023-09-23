package com.revision;

import java.util.Scanner;

public class TwinPrime
{
	static boolean isPrime(int num)
	{
		if((num==0 || num==1))
			return false;
		else
		{
			for(int i=2;i<num;i++)
			{
				if((num%i==0))
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1 num:");
		int n1=sc.nextInt();
		
		System.out.println("Enter 2 num:");
		int n2=sc.nextInt();
		sc.close();
		boolean status=false;
		if(isPrime(n1))
		{
			if(isPrime(n2))
			{
				if((n2-n1)==2 || (n1-n2)==2)
				{
				status=true;
				}
			}
		}
		if(status)
		{
			System.out.println("Numbers are twin prime.....");
		}
		else
		{
			System.out.println("Numbers are not twin prime.....");
		}
	}
}

