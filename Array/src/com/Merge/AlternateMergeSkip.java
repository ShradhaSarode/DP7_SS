package com.Merge;

import java.util.Arrays;

public class AlternateMergeSkip 
{
	static int[] alternateMergeSkip(int ar1[],int ar2[])
	{
		int maxLength=Math.max(ar1.length, ar2.length);
		int marge[]=new int[maxLength];
		int index=0;
		int i=0;
	    while(index<maxLength)
	    {
	    	if(i<ar1.length)
	    	{
	    		marge[index++]=ar1[i++];
	    	}
	    	if(i<ar2.length)
	    	{
	    		marge[index++]=ar2[i++];
	    	}
	    }
		return marge;
	}
	public static void main(String[] args)
	{
		int arr1[]= {1,2,3,4};
		int arr2[]= {5,6,7,8,9,10};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		int mergeArray[]=alternateMergeSkip(arr1,arr2);
		System.out.println("Merging two Array:"+Arrays.toString(mergeArray));
	}

}
