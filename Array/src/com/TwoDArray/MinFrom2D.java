package com.TwoDArray;

public class MinFrom2D
{
	public static void findMin(int ar[][])
	{
		int i;
		System.out.println("Length of array:"+ar.length);
		for(i=0;i<2;i++)
		{
			int min=Integer.MAX_VALUE;
			for(int j=0;j<3;j++)
			{
				if(ar[i][j]<min)
				{
					min=ar[i][j];
				}
			}
			System.out.println("Max value:"+min);
		}
	}
	public static void main(String[] args)
	{
		int arr[][] = {{22, 31, 9}, {12, 25, 16}};
		findMin(arr);
	}

}
