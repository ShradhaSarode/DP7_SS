package com.TwoDArray;
//WAP to print maximum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} 
//output is: 31 and 25.
public class MaxFrom2Array
{
	public static void findMax(int ar[][])
	{
		int i;
		for(i=0;i<2;i++)
		{
			int max=Integer.MIN_VALUE;
			for(int j=0;j<3;j++)
			{
				if(ar[i][j]>max)
				{
					max=ar[i][j];
				}
			}
			System.out.println("Max value:"+max);
		}
	}
	public static void main(String[] args)
	{
		int arr[][] = {{22, 31, 9}, {12, 25, 16}};
		findMax(arr);
	}

}
