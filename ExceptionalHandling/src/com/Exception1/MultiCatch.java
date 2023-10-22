package com.Exception1;

import java.util.Scanner;

public class MultiCatch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			int arr[]=new int[3];
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("enter a num:");
			    arr[i]=sc.nextInt();
			}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+":"+(100/arr[i]));
		}
		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		
		// The below codes becomes unreachable code if you create Exception
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e+"-index is greater");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e+"can not divide by zero");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("---------------------");
			sc.close();
			System.out.println("scanner closed");
		}
	}

}
