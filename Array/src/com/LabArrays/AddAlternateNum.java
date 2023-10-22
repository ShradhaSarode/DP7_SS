package com.LabArrays;

import java.util.Arrays;

public class AddAlternateNum
{
	public static void addAlternate(int ar[])
	{
		int sum=0;	
		for(int i=0;i<ar.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(ar[i]);
				sum+=ar[i];
			}
		}
		System.out.println(Arrays.toString(ar));
		System.out.println("Sum:"+sum);
		
	}
	public static void main(String[] args)
	{
		int arr[]= {8,2,3,4,6,9};
		addAlternate(arr);
	}

}
