package com.Exception1;

public class NestedTry2 {

	public static void main(String[] args)
	{
		int arr[]= {4,0,9};
		try
		{
			for(int i=0;i<=arr.length;i++)
				System.out.println("ans"+(100/arr[i]));
		}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e+"- index is greater");
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
			//sc.close();
			System.out.println("Task closed");
		}
}
}
