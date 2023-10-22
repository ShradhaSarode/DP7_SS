package com.advanced;

public class SecondHeighest
{
	static void secondHigh(int arr[])
	{
		int high=Integer.MIN_VALUE;
		int shigh=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>high)
			{
				shigh=high;
				high=arr[i];
			}
			else if(arr[i]>shigh)
			{
				shigh=arr[i];
			}
		}
		System.out.println("second highest:"+shigh);
	}
	public static void main(String[] args) 
	{
		int arr[]= {8,2,3,4,6,9};
		secondHigh(arr);

	}

}
