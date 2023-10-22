package com.TwoDArray;

import java.util.Arrays;
import java.util.Random;

public class SuffleArray
{
	public static void suffleArray(int ar[])
	{
		Random r=new Random();
		//System.out.println(r.nextInt(ar.length));
		
		int temp=0;
		for(int i=0;i<ar.length;i++)
		{
			int j=r.nextInt(ar.length);
			 temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
		System.out.println("After shuffle:");
		System.out.println(Arrays.toString(ar));
	}
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6,7,8};
		System.out.println("Before shuffle:"+Arrays.toString(arr));
		suffleArray(arr);
	}

}
