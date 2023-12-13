package com.Revision;

import java.util.Scanner;
/*
 A tech number has even number of digits. If the number is split in two equal halves then square of sum
  of these halves is equal to the number itself. 
 Write a program to generate and print all four digits tech numbers.  e.g.) number : 3025->(30+25)2 =(55)2 =3025 
 */
public class SplitTechNum
{
	static void countDigits(int num)
	{
		int count=0;
		int original=num;
		int pow=1;
		do
		{
			num/=10;
			count++;
		}while(num!=0);
		
		System.out.println("Number of count:"+count);
		for(int i=1;i<=count/2;i++)
		{
			 pow=pow*10;
		}
		if(count%2==0)
		{
			int firsthalf=original/pow;
			int secondhalf=original%pow;
			int total=firsthalf+secondhalf;
			int ans=total*total;
			if(ans==original)
			{
			System.out.println("Number is tech:"+ans);
			}
			else
			{
				System.out.println("Number is not tech:"+ans);
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter only Even number:");
		int num=sn.nextInt();
		sn.close();
		countDigits(num);
	}

}
