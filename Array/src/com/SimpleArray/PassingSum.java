package com.SimpleArray;

import java.util.Arrays;

public class PassingSum
{
	static void sumArray(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
			sum+=ar[i];
			}
		}
		System.out.println(Arrays.toString(ar));
		System.out.println("Sum of even array:"+sum);
	}
	public static void main(String[] args)
	{
		int arr[]= {1,6,3,4,5};
		sumArray(arr);
		
	}
}
