package com.StringAssignment;
//14.	Write a Java program to find first occurrence of a word in a given string.
//AddOns

public class FourteenQ
{
	public static void main(String[] args)
	{
		 String st = "The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string";
	     String target = "method";

	        int firstOccurrence = findFirstOccurrence(st, target);

	        if (firstOccurrence != -1)
	        {
	            System.out.println("The first occurrence of '" + target + "' is at index " + firstOccurrence);
	        }
	        else
	        {
	            System.out.println("The character '" + target + "' was not found in the string.");
	        }
	    }
	    public static int findFirstOccurrence(String s, String t)
	    {
	    	 String[] words = s.split("\\s+");

	         for (int i = 0; i < words.length; i++)
	         {
	             if (words[i].equals(t))
	             {
	                 return s.indexOf(words[i]);
	             }
	         }
	         return -1; 
	     }
	}

