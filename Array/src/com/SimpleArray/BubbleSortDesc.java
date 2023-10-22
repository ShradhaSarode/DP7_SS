package com.SimpleArray;

import java.util.Arrays;

public class BubbleSortDesc
{
	static void sortAr(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				//swapping
				if(ar[i]<ar[j])//decending
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		 int arr[]= {3,4,1,7,8,2};
	        System.out.println("before:"+Arrays.toString(arr));
	        sortAr(arr);
	        System.out.println("after:"+Arrays.toString(arr));
	}

}
