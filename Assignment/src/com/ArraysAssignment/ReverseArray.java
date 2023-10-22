package com.ArraysAssignment;

import java.util.Arrays;

/*
  WAP to reverse the array itself, don’t print array in reverse – I want current array 
reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 
37, 29, 45, 90, 3] by using temporary array. 
 */
public class ReverseArray
{
	 static void reverseArray(int  ar[])
		{
			int count=0;
			for(int i =ar.length-1;i>ar.length/2;i--)
			{
				int temp=ar[i];
				ar[i]=ar[count];
				ar[count]=temp;
				count++;
				//System.out.print(ar[i]+" ");
			}
		}
	public static void main(String[] args)
	{
		int arr[] = {3, 90, 45, 29, 37, 78};
		System.out.println("Before:"+Arrays.toString(arr));
		System.out.println("Reverse Array :");
		reverseArray(arr);
		System.out.println("After:"+Arrays.toString(arr));
	}

}
