package com.ArraysAssignment;

import java.util.Arrays;
//WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90]
public class SecondMax 
{
	static void secondMaxVal(int arr[])
	{
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				smax=max;
				max=arr[i];
			}
			else if(arr[i]>smax)
			{
				smax=arr[i];
			}
		}
		System.out.println("Second Max value:"+smax);
	}
	public static void main(String[] args)
	{
		int arr[]= {20, 0, 31, 45, 100, 1, 105, 90};
		System.out.println("Array:"+Arrays.toString(arr));
		secondMaxVal(arr);
	}

}
