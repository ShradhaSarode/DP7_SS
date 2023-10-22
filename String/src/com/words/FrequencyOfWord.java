package com.words;

public class FrequencyOfWord
{
	public static void findFrequency(String st)
	{
		String str[]=st.split("\\s");
		int count;
		for(int i=0;i<str.length;i++)
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
			System.out.println(str[i]+"------>"+count);
		}
	}
	public static void main(String[] args)
	{
		String str="a big cat is rolling on a big mat";
		findFrequency(str);
	}

}
