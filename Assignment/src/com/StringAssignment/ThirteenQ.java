package com.StringAssignment;

//import java.util.Arrays;

//13.	Write a Java program to count total number of words in a string.
public class ThirteenQ
{
	public static void main(String[] args)
	{
		String s="I am sharadha";
		System.out.println(s);
		
		 int wordCount = countWords(s);
	        System.out.println("Total words in the string: " + wordCount);
	}
	    public static int countWords(String st)
	    {
	        String[] words = st.split("\\s+");
	        return words.length;
	    }
	}

