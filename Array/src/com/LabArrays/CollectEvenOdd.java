package com.LabArrays;

import java.util.Arrays;

public class CollectEvenOdd
{
	public static void collectEvenOdd(int ar[])
	{
		int count=0;
		int arr2[]=new int[ar.length];
		System.out.println("Even num:");
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				arr2[count]=ar[i];
				count ++;
				System.out.println(ar[i]);
			}
		}
		System.out.println("Odd num:");
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2!=0)
			{
				arr2[count]=ar[i];
				count ++;
				System.out.println(ar[i]);
			}
		}
		System.out.println("After:"+Arrays.toString(arr2));
	}
	public static void main(String[] args)
	{
		int arr[]={2,3,1,4,6,7,8,11};
		System.out.println("Before:"+Arrays.toString(arr));
		collectEvenOdd(arr);
	}

}
