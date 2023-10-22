package com.SimpleArray;

public class DivisibleBy
{
	public static void main(String[] args)
	{
		int[] arr= {4,5,3,30,15,10};
		int sum=0;
		for (int i:arr)
		{
			if(i%3==0&&i%5==0)
			{
				sum+=i;
			}
		}
		System.out.println("Sum of num divisible by 3&5:"+sum);
	}

}
