package com.words;

public class StringArrayComparison
{
static void uniqueString(String st1[],String st2[])
{
	boolean found;
	for(String s:st2)
	{
		found=false;
		for(String s1:st1)
		{
			if(s.equals(s1))
			{
				found=true;
				break;
			}
		}
		if(!found)
			System.out.println(s);
	}
}

	public static void main(String[] args)
	{
		String str1[]= {"neha","pralay","shradha","shivani","aniket"};
		String str2[]= {"pratiksha","dipti","neha","anuj","shivani","shivam"};
		uniqueString(str1,str2);
	}

}
