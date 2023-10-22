package com.LabString;

import java.util.Arrays;

public class CharSplitFindVowel
{
	public static void findVowelChange(String s1)
	{
		char ch[]=s1.toCharArray();
		System.out.println(s1);
		for(int i=0;i<s1.length();i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				ch[i]='$';
			}
		}
		System.out.println(Arrays.toString(ch));
		System.out.println("------------------------------------");
	}
	public static void findVowelUpper(String s2)
	{	
		char ch[]=s2.toCharArray();
		System.out.println(s2);
		for(int i=0;i<s2.length();i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				ch[i]=Character.toUpperCase(ch[i]);
			}
		}
		//System.out.println("------------------------------------------");
		System.out.println(Arrays.toString(ch));
	}
	public static void main(String[] args)
	{
		String s="shradha";
		findVowelChange(s);
		findVowelUpper(s);
	}

}
