package com.words;

public class MaxFrequencyWord 
{
	public static void maxWord(String st)
	{
		String str[]=st.split("\\s");
		int count=0;
		int max=0;
		String word=" ";
		int i;
		for( i=0;i<str.length;i++)
		{
			if(str[i].equals("visited"))
				continue;
			count=1;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
					count++;
					str[j]="visited";
				}
			}
			//System.out.println(str[i]+"------>"+count);
			if(count>max)
			{
				max=count;
				word=str[i];
			}
			if(count>1)
				System.out.println("duplicate:   "+str[i]);
			if(count==1)
				System.out.println("unique:   "+str[i]);
		}
		System.out.println("most repeated:  "+word);	
	}
	public static void main(String[] args)
	{
		String s="I love my India, because India is my country and my country is grate.";
		 maxWord(s);
	}

}
