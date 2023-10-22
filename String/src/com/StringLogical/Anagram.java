package com.StringLogical;

import java.util.Scanner;

public class Anagram
{
	static void sortArray(char ch[])
	{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
	}
	static boolean checkAnagram(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()!=s2.length())
			return false;
		else
		{
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			sortArray(ch1);
			sortArray(ch2);
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word 1:");
		String w1=sc.next();
		System.out.println("Enter word 2:");
		String w2=sc.next();
		if(checkAnagram(w1,w2))
		{
			System.out.println("string is anagram");
		}
		else
		{
			System.out.println("string is not anagram");
		}
	}
}
