package com.SimpleArray;

import java.util.Arrays;

public class PassingArray
{
	static void squareArray(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=ar[i]*ar[i];
			sum+=ar[i];
		}
		System.out.println(Arrays.toString(ar));
		System.out.println("Sum of square array:"+sum);
	}
	public static void main(String[] args)
	{
		int arr[]= {1,6,3,4,5};
		System.out.println("before:"+Arrays.toString(arr));
		squareArray(arr);
		System.out.println("after:"+Arrays.toString(arr));
	}

}
