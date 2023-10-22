package com.MLab;



public class CustomException
{

	public static void main(String[] args)
	{
		String [] arr= {"java","c","angular","python"};
		for(int i=0;i<arr.length;i++)
		{
		try
		{
			if(arr[i].length()<3)
			{
				throw new InvalidStringException(arr[i] + " " +"length is less than 3:");
			}
			System.out.println("String Length: "+arr[i]);
		}
		catch(InvalidStringException e)
		{
			System.out.println(e);
		}
	}
	}

}
