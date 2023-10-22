package com.LabString;

public class RemoveFirstLastLetter
{
	public static void firstLastRemove(String st)
	{
		char ch[]=st.toCharArray();
		ch[0]='\0';
		ch[ch.length-1]='\0';
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]!='\0')
			{
				System.out.println(ch[i]);
				
			}
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		String s="hello world";
		firstLastRemove(s);
	}

}
