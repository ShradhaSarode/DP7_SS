package com.LabArrays;

import java.util.Arrays;

public class RightShiftZero
{
	public static int[] rightshiftZero(int ar[])
	{
		int count=0;
		int arr2[]=new int[ar.length];
		System.out.println("Shift Zero:");
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				arr2[count]=ar[i];
				count ++;
				System.out.println(ar[i]);
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				arr2[count]=ar[i];
				count ++;
				System.out.println(ar[i]);
			}
		}
		return arr2;
		
	}
	public static void main(String[] args)
	{
		int arr[]={2,13,0,4,6,0,18,11};
		System.out.println("Before:"+Arrays.toString(arr));
		System.out.println("Right Shift 0:"+Arrays.toString(rightshiftZero(arr)));
	}

}
