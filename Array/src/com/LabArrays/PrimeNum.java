package com.LabArrays;

import java.util.Arrays;

public class PrimeNum {
 static void primeNum(int ar[]) {
		int sum = 0;
		boolean flag = true;
		for (int i = 0; i < ar.length; i++)
		{
			if(ar[i]==0 || ar[i]==1)
			{
				flag=false;
			}
			for (int j = 2; j < ar[i]; j++)
			{
				if (ar[i] % j == 0)
				{
					flag = false;
					break;
				}
			}
			if (flag)
			{
				sum += ar[i];
				System.out.println("Prime numbers are:"+ar[i]);
			}
		}

		System.out.println("Sum of Prime num:" + sum);

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };// 2 3 5 7 11

		primeNum(arr);
		
	}

}
