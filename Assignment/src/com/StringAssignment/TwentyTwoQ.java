package com.StringAssignment;
//22.	Write a Java program to count total number of vowels and consonants in a string.
public class TwentyTwoQ
{
	static void countVowelsConsonants(String s)
	{
		char ch[]=s.toCharArray();
		int vCount=0;
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&& ch[i]<='z')
			{
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
					//||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'
			{
				vCount++;
		     }
				else
				{
					count++;
				}
			}
		}
		System.out.println("Vowel count: "+vCount);
		System.out.println("Consonants count: "+count);
	}
	public static void main(String[] args)
	{
		String st="hello world";
		countVowelsConsonants(st);
	}
}
