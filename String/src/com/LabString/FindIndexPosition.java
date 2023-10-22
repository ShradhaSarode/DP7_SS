package com.LabString;

public class FindIndexPosition
{
	public static int find2Position(String st,char ch)
	{
		int count=0;
		int i;
		for( i=0;i<st.length();i++)
		{
			if(st.charAt(i)==ch)
				count++;
			if(count>1)
			{
				break;
			}
		}
		
		return i;
	}
	public static void main(String[] args)
	{
		String s="Javvv Program";
		char chFind='a';
		System.out.println("character 2nd occurance:"+find2Position(s,chFind));
	}
}
