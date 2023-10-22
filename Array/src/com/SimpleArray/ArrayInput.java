package com.SimpleArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value:");
			arr[i]=sc.nextInt();
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
	}
}
