package com.LabArrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertingNum
{
	public static void insertNum(int ar[],int index,int num)
	{
		for(int j=1;j<ar.length;j++)
		{
			ar[j]=ar[j-1];
		}
		ar[index]=num;
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int arr[]=new int[6];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Before:"+Arrays.toString(arr));
		insertNum(arr,1,100);
		System.out.println("After:"+Arrays.toString(arr));
		sc.close();
	}
}
