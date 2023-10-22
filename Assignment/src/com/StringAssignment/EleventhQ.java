package com.StringAssignment;
//11.	Write a Java program to count occurrences of a character in given string.
public class EleventhQ
{
	 public static int findCountOccurrence(String s, char t)
	    {
		 int count=0;
	        for (int i = 0; i < s.length(); i++)
	        {
	            if (s.charAt(i) == t)
	            {
	            	 count++;
	            }
	        }
	        return count; 
	    }
	public static void main(String[] args)
	{
		String st = "Hello, World!";
        char target = 'l'; 
       
        int occurrenceCount = findCountOccurrence(st, target);
        System.out.println("The character '" + target + "' appears " + occurrenceCount + " times in the string.");
	}
}
