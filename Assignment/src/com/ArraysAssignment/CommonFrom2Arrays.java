package com.ArraysAssignment;

import java.util.Arrays;

/*
7.Write a Java program to find the common elements between two arrays (int values) 
Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and arr2[] = [39, 25, 15, 23, 55, 91, 
66, 22], so common between two arrays are 23 and 91 
 */
public class CommonFrom2Arrays
{
	public static int commonFrom2Array(int ar1[],int ar2[])
	{
		int i;
		System.out.println("Common Elements are:");
		for( i=0;i<ar1.length;i++)
		{
			for(int j=0;j<ar2.length;j++)
			{
				if(ar1[i]==ar2[j])
				{
				ar2[j]=0;
				System.out.println(ar1[i]);
				}
			}
		}
		return 1;
	}
	public static void main(String[] args)
	{
		int arr1[] = {12, 23, 34, 67 ,78, 91, 56};
		int arr2[] = {39, 25, 15, 23, 55, 91, 66, 22};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		commonFrom2Array(arr1,arr2);
	}

}
