package com.looplogic;

import java.util.Scanner;

public class Perfect_num {
	static void check_perfect(int num)
	{
		int sum=0;		
		for(int i=1;i<num;i++)
		{
			if(num%i==0) // factor
			{
				sum+=i;
			}
		}
		
		if(sum==num)
		{
			System.out.println(num +": is a Perfect Number");
		}
		else
		{
			System.out.println(num +": is not a Perfect Number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any num:");
		int num=sc.nextInt();
		check_perfect(num);
		sc.close();

	}

}
