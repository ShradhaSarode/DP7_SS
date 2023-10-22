package com.ArraysAssignment;

import java.util.Arrays;
/*
 * 9. Write a Java program to test the equality of two arrays.
 *  Means e.g arr1[] = [12, 22, 32, 42, 52, 62] 
 *  and arr2[] = [52, 22, 62, 12, 42, 22] 
Here both arrays are equal 
 */
public class EqualitTest
{
	public static boolean testEquality(int ar1[],int ar2[])
	{
		if(ar1.length!=ar2.length)
			return false;
		  Arrays.sort(ar1);
	      Arrays.sort(ar2);
	      for (int i = 0; i < ar1.length; i++)
	      {
	            if (ar1[i] != ar2[i])
	            {
	                return false;
	            }
	      }
		return true;
	}
	public static void main(String[] args)
	{
		int arr1[] = {12, 22, 32, 42, 52, 62};
		int arr2[] = {52, 22, 62, 12, 42, 22};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr1));
		 boolean areEqual = testEquality(arr1, arr2);
		 if (areEqual)
		 {
	           System.out.println("Both arrays are equal.");
	      } 
		 else
		 {
	           System.out.println("The arrays are not equal.");
	      }
		//testEquality(arr1,arr2);
	}

}
