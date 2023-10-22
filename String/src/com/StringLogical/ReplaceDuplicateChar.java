package com.StringLogical;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceDuplicateChar
{
	public static String findDuplicate(String st)
	{
char ch[]= st.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					//System.out.println(j);
					ch[j]='$';
				}
			}
		}
		st= new String(ch);
		return st;
//		System.out.println(Arrays.toString(ch));
//		System.out.println("------------------------------------");
	}
	public static void main(String[] args)
	{
		//String s="hello";
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a word1:");
		
		String word= sc.next();
		
		System.out.println("Original word:"+word);
		
		//word=replaceDup(word);
		System.out.println((findDuplicate(word)));
		//System.out.println("New word:"+word);
	}

}
