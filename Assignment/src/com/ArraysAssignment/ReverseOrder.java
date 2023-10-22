package com.ArraysAssignment;

import java.util.Arrays;

/*
 WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] so your 
output must be 78, 37, 29, 45, 90, 3
 */
public class ReverseOrder
{
	 static void reverseArray(int  ar[])
	{
		//int count=0;
		for(int i =ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		int arr[] = {3, 90, 45, 29, 37, 78};
		System.out.println("Before:"+Arrays.toString(arr));
		System.out.println("Reverse Array :");
		reverseArray(arr);
	}

}
