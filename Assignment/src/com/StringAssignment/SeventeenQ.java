package com.StringAssignment;
//17.	Write a Java program to remove all occurrences of a character from string. replaceALL()
public class SeventeenQ
{
	public static String removeCharacter(String s, char target)
    {
		 String modifiedString = s.replaceAll(String.valueOf(target), "");

	        return modifiedString;
    }
	public static void main(String[] args)
	{
		String st = "Hello, World!";
        char tChar = 'o'; 
//        String md=st.replaceAll(st, "$");
//        System.out.println(md);
        String modifiedString = removeCharacter(st, tChar);

        System.out.println("Original String: " + st);
        System.out.println("Modified String: " + modifiedString);
	}

}
