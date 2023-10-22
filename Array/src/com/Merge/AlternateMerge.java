package com.Merge;

import java.util.Arrays;

public class AlternateMerge
{
	static int[] alternatemergeArray(int ar1[],int ar2[])
	{
		int marge[]=new int[ar1.length+ar2.length];
		int index=0;
		int maxLength=Math.max(ar1.length, ar2.length);
	    for(int i=0;i<maxLength;i++)
	    {
	    	if(i<ar1.length)
	    	{
	    		marge[index]=ar1[i];
	    		index++;
	    	}
	    	if(i<ar2.length)
	    	{
	    		marge[index]=ar2[i];
	    		index++;
	    	}
	    }
		return marge;
	}
	public static void main(String[] args)
	{
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {11,12,13};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		int mergeArray[]=alternatemergeArray(arr1,arr2);
		System.out.println("Merging two Array:"+Arrays.toString(mergeArray));

	}

}
