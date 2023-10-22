package com.LabString;

public class FindRemoveDuplicate
{
	public static void FindRemoveDup(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='\0')
				continue;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]='\0';
				}
			}
			System.out.println(ch[i]);
		}
	}

	public static void main(String[] args)
	{
		String s="shradha";
		System.out.println(s);
		FindRemoveDup(s);
	}

}
