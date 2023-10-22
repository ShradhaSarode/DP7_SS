package com.advanced;

import java.util.Arrays;

public class RightRotateArray
{
	static void rotateOnce(int ar[])
	{
		int lastE=ar[ar.length-1];
		for(int i=ar.length-1;i>0;i--)
		{
			ar[i]=ar[i-1];
		}
		ar[0]=lastE;
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args)
	{
		int arr[]= {8,2,3,4,6,9,1,5};
		System.out.println("Before:"+Arrays.toString(arr));
		int n=3;
		for(int i=0;i<n;i++)
		{
			rotateOnce(arr);
		}
		System.out.println("After:"+Arrays.toString(arr));
	}

}
