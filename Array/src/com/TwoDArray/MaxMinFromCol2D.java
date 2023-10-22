package com.TwoDArray;
/*
 27.WAP to print maximum in columns. Means e.g. arr[][]= {{22, 31, 9}, {12, 5, 16}, 
{34, 42, 2}} output is: 34, 42, and 16. 
28. WAP to print minimum in columns. Means e.g. arr[][]={{22, 31, 9}, {12, 5, 16}, 
{34, 42, 2}} output is: 12, 5, 2. 
 */
public class MaxMinFromCol2D
{
	public static void checkMaxCol(int ar[][])
	{
		int i;
		for(int j=0;j<3;j++)
		{
			int max=Integer.MIN_VALUE;
		for(i=0;i<3;i++)
		{
			if(ar[i][j]>max)
			{
				max=ar[i][j];
			}
			}
			System.out.println("max from col:"+max);
		}
	}
	public static void checkMinCol(int ar[][])
	{
		int i;
		for(int j=0;j<3;j++)
		{
			int min=Integer.MAX_VALUE;
		for(i=0;i<3;i++)
		{
			if(ar[i][j]<min)
			{
				min=ar[i][j];
			}
		}
			System.out.println("min from col:"+min);
		}
	}
	public static void main(String[] args)
	{
		int arr[][]= {{22, 31, 9}, {12, 5, 16}, {34, 42, 2}};
		checkMaxCol(arr);
		checkMinCol(arr);
	}
}
