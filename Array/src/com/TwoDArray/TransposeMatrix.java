package com.TwoDArray;

public class TransposeMatrix
{
	public static void checkTranspose(int ar[][])
	{
		System.out.println("2 Rows & 3 Coloumn");
		int i;
		for(int j=0;j<3;j++)
		{
		for(i=0;i<2;i++)
		{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	
	}
	public static void main(String[] args) {
		int arr[][]= {{1, 2,3}, {4, 5,6 } };
		
		int i;
		System.out.println("3 Rows & 3 Coloumn");
		for(i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		checkTranspose(arr);
	}
}
