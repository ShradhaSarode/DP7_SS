package com.LabString;

public class ShortFullName
{
	public static void shortName(String s)
	{
		String st[]=s.split("\\s");
		String str="";
		for(int i=0;i<st.length;i++)
		{
			if(i==st.length-1)
				str+=st[i];
			else
			{
				char ch=st[i].charAt(0);
				str+=ch+".";
			}
		}
		System.out.println(str);
		System.out.println("----------------------------------");
		int len=s.length();
		int index1=s.indexOf(' ');
		int index2=s.lastIndexOf(' ');
		System.out.println(s.charAt(0)+"."+s.charAt(index1+1)+"."+s.substring(index2+1, len));
	}
	public static void main(String[] args)
	{
		String s="Shradha Dhananjay Sarode";
		System.out.println(s);
		shortName(s);
	}

}
