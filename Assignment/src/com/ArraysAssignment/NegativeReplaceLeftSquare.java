package com.ArraysAssignment;

import java.util.Arrays;

/*
 13. WAP to replace all negative value with its immediate left elements square. Means 
arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49]. 
 */
public class NegativeReplaceLeftSquare
{
	public static void negativeReplace(int ar[])
	{
//		if(ar[0]<0)
//		{
//			System.out.println("no left element available before 1st element.");
//		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			{
				ar[i]=ar[i-1]*ar[i-1];
			}
		}
		System.out.println(Arrays.toString(ar));
	}
	public static void main(String[] args)
	{
		int arr[] = {12, 3, -19, 29, 5, -61, 44, 7, -9};
		negativeReplace(arr);
	}
}
