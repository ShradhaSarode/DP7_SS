package com.TwoDArray;

import java.util.Scanner;

public class TwoD3Matrix
{
	public static void ThreeByThree(int ar[][],int row,int col)
	{
		int i;
		for(i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num of row:");
		int row=sc.nextInt();
		System.out.println("Enter num of col:");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		int i;
		for(i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		ThreeByThree(arr,row,col);
	
	}
}
