package com.LabString;

public class AvgStringInt
{
	public static void findInt(String s)
	{
		char ch[]=s.toCharArray();
		int sum=0;
		int count=0;
		int avg=0;
		System.out.println("using logic");
		for(int i=0;i<ch.length;i++)
		{
			if (ch[i] >= 48 && ch[i] <= 57)	
			{
				//count++;
				sum +=ch[i]-48;
				count++;
				avg=sum/count;
			}
		}
		System.out.println("Average of int from String:"+avg);
		System.out.println("-----------------------------------");
//		System.out.println("using method");
//		for(int i=0;i<ch.length;i++)
//		{
//			if(Character.isDigit(ch[i]))
//			{
//				sum +=Character.getNumericValue(ch[i]);
//				count++;
//			}
//		}
//		avg=sum/count;
//		System.out.println("Average of int from String:"+avg);
	}
	public static void main(String[] args)
	{
		//if (st[i] >= '0' && st[i] <= '9')	
		String s="a5i9gfj4tabc";
		findInt(s);
	}

}
