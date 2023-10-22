package com.SimpleArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value:");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum"+sum);
		float ar[]= {12.3f,15.4f,17.1f,25.2f,30.2f};
		float sumj=0f;
		for(int j=0;j<arr.length;j++)
		{
			System.out.println("Enter the value:");
			arr[j]=sc.nextInt();
			sumj+=arr[j];
		}
		System.out.println("Sum"+sumj);
	}

}
