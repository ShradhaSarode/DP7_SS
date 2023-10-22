package com.ArraysAssignment;

import java.util.Arrays;

/*
 8.WAP to swap array like input array is [2, 4, 9, 0],
  so your output array must be [9, 0, 2, 4] 
 */
public class SwapElement
{
	public static void swapHalf(int ar[])
	{
		//int count=0;
		for(int i=0;i<ar.length/2;i++)
		{
			int temp=ar[i];
			ar[i]=ar[i+2];
			ar[i+2]=temp;
		}
		System.out.println("After:"+Arrays.toString(ar));
	}
	public static void main(String[] args)
	{
		int arr[]= {2, 4, 9, 0};
		System.out.println("Before:"+Arrays.toString(arr));
		swapHalf(arr);
		
	}

}
