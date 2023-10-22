package com.ArraysAssignment;

import java.util.Arrays;

//. WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23]
public class SecondMin
{
	static void secondMinVal(int arr[])
	{
		int min=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>min)
			{
				smin=min;
				min=arr[i];
			}
			else if(arr[i]<smin)
			{
				smin=arr[i];
			}
		}
		System.out.println("Second Min value:"+smin);
	}
	public static void main(String[] args)
	{
		int arr[]= {-20, 0, -25, 15, 19, 37, 23};
		System.out.println("Array:"+Arrays.toString(arr));
		secondMinVal(arr);
	}

}
