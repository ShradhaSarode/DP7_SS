package com.Revision;

import java.util.Scanner;
/*
 74125857452
 2=2
 7=2
 5=3 times
 */
public class CountRepeatNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		sc.close();
		for(int i=0;i<=9;i++)
		{
			int count=0;
			int original=num;
			while(original!=0)
			{
				int r=original%10;
				if(i==r)
				{
					count++;
				}
				original/=10;
			}
			if(count>1)
			{
				System.out.println("Duplicate digit:"+i+" count:"+count);
			}
			if(count==1)
			{
				System.out.println("Unique digit(single digit):"+i+" count:"+count);
			}
			if(count>0)
			{
				System.out.println("Frequency of digit:"+i+"---->"+count);
			}
		}

	}

}
