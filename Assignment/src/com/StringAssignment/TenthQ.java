package com.StringAssignment;
//10.	Write a Java program to find first occurrence of a character in a given string.
public class TenthQ
{
//	
	public static void main(String[] args)
	{
        String st = "Hello, World!";
        char target = 'o'; // The character to find

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

    public static int findFirstOccurrence(String s, char t)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == t)
            {
                return i; // Return the index of the first occurrence
            }
        }
        return -1; // Return -1 if the character is not found in the string
    }
}



