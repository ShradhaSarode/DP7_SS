package com.StringAssignment;
//21.	Write a Java program to toggle case of each character of a string.
public class TwentyOneQ
{
	
	public static void main(String[] args)
	{
		String s1 = "Hello, World!";
        String toggledString = toggleCase(s1);
        System.out.println("Original String: " + s1);
        System.out.println("Toggled Case: " + toggledString);
    }

    public static String toggleCase(String st)
    {
        char[] charArray = st.toCharArray();

        for (int i = 0; i < charArray.length; i++)
        {
            char currentChar = charArray[i];

            if (Character.isUpperCase(currentChar))
            {
                charArray[i] = Character.toLowerCase(currentChar);
            }
            else if (Character.isLowerCase(currentChar))
            {
                charArray[i] = Character.toUpperCase(currentChar);
            }
        }
        return new String(charArray);
    }
}
