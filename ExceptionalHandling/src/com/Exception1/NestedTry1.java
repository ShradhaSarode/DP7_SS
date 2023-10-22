package com.Exception1;

public class NestedTry1 {

	public static void main(String[] args)
	{
		int arr[]= {4,0,9};
		try
		{
			for(int i=0;i<=arr.length;i++)
				try
			{
					System.out.println((100/arr[i]));
			}
			catch(ArithmeticException e)
			{
				System.out.println(e+"can not divide by zero");
			}
		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		// The below codes becomes unreachable code if you create Exception
		
				catch (ArrayIndexOutOfBoundsException e)
				{
					System.out.println(e+" - Index is greater");
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
