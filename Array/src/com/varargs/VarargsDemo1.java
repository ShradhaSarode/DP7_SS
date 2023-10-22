package com.varargs;

public class VarargsDemo1
{
	static void display(int ar[])
	{
		for(int i:ar)
		{
			System.out.println(i+" ");
		}
		System.out.println();
	}
	static void displayElement(int ...a)
	{
		for(int i:a)
		{
			System.out.println(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		int arr[]= {2,9,1,5};
		int arr2[]= {8,2,3,4,};
		int arr3[]= {6,9,1,5};
		display(arr);
		System.out.println("----------------------------------");
		display(arr2);
		System.out.println("----------------------------------");
		display(arr3);
		System.out.println("---------------------");
		displayElement(2,3,4);
		System.out.println("----------------------------------");
		displayElement(5,8,2,3,4);
		System.out.println("----------------------------------");
		displayElement(9,7,2,5,3,4);
		System.out.println("----------------------------------");
	}

}
