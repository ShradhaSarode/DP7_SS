package com.Merge;

import java.util.Arrays;

public class CompleteMerge
{
	static int[] mergeArray(int ar1[],int ar2[])
	{
		int marge[]=new int[ar1.length+ar2.length];
		int i=0;
		for(int j=0;j<ar1.length;j++)
		{
			marge[i]=ar1[j];
			i++;
		}
		for(int j=0;j<ar2.length;j++)
		{
			marge[i]=ar2[j];
			i++;
		}
		return marge;
		
	}

	public static void main(String[] args)
	{
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9,10};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		int mergeArray[]=mergeArray(arr1,arr2);
		System.out.println("Merging two Array:"+Arrays.toString(mergeArray));
	}

}
