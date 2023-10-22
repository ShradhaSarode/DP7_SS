package com.StringAssignment;
//15.	Write a Java program to search all occurrences of a character in given string.
public class FifteenQ
{
	 public static int[] findCharacterOccurrences(String inputString, char targetChar)
	    {
	        int count = 0;
	        for (int i = 0; i < inputString.length(); i++)
	        {
	            if (inputString.charAt(i) == targetChar)
	            {
	                count++;
	            }
	        }

	        int[] occurrences = new int[count];
	        int currentIndex = 0;
	        for (int i = 0; i < inputString.length(); i++)
	        {
	            if (inputString.charAt(i) == targetChar)
	            {
	                occurrences[currentIndex] = i;
	                currentIndex++;
	            }
	        }
	        return occurrences;
	    }

	public static void main(String[] args)
	{
		String inputString = "Hello, World!";
        char targetChar = 'o'; 

        int[] occurrences = findCharacterOccurrences(inputString, targetChar);

        if (occurrences.length > 0)
        {
            System.out.print("The character '" + targetChar + "' appears at indices: ");
            for (int i = 0; i < occurrences.length; i++)
            {
                System.out.print(occurrences[i]);
                if (i < occurrences.length - 1)
                {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        else
        {
            System.out.println("The character '" + targetChar + "' was not found in the string.");
        }
    }
}