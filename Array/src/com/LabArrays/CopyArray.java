package com.LabArrays;

import java.util.Arrays;

public class CopyArray
{
	public static int[] copyArray(int ar[])
	{
		//int count=0;
		int arr2[]=new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			arr2[i]=ar[i];
		//count++;
		}
		
		return arr2;
		
	}
	public static void main(String[] args)
	{
		
		int arr[]={2,3,1,4,6,7,8,11};
		System.out.println("1 Array:"+Arrays.toString(arr));
		System.out.println("2 Arrayr:"+Arrays.toString(copyArray(arr)));
		//System.out.println("After:"+Arrays.toString(arr2));
	}

}
