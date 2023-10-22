package com.LabArrays;

public class MaxChar
{
	static char findMaxChar(char ar[])
	{
		char max=Character.MIN_VALUE;
		for(char i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max= ar[i];
			}
		}
		return max;
	}
	public static void main(String[] args)
	{
		char arr[]= {'a','r','t','v'};
		System.out.println("Max char is:"+findMaxChar(arr));
	}

}
