package com.StringAssignment;
/*
 8.Write a Java program to copy one string to another string.
 */
public class EighthQ
{
	public static void main(String[] args)
	{
		String s1="ritu";
		//System.out.println(s1);
		String c1 = new String(s1);

        System.out.println("Method 1 - Copied String: " + c1);

        // Method 2: Using String's substring method
        String c2 = s1.substring(0); // This creates a substring from the start index to the end of the source string.

        System.out.println("Method 2 - Copied String: " + c2);
	}

}
