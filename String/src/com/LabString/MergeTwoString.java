package com.LabString;

public class MergeTwoString
{
	public static void mergeString(String s1,String s2)
	{
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		char merge[]=new char[ch1.length+ch2.length+1];
		int count=0;
		
		for(int i=0;i<ch1.length;i++)
		{
			merge[count]=ch1[i];
			count++;
		}
		merge[count]=' ';
		count++;
		for(int j=0;j<ch2.length;j++)
		{
			merge[count]=ch2[j];
			count++;
		}
		System.out.println(merge);
	}
	public static void main(String[] args)
	{
		String st1="Shradha";
		String st2="Sarode";
		System.out.println("String st1:"+st1);
		System.out.println("String st2:"+st2);
		System.out.println("After merge:");
		mergeString(st1,st2);
	}

}
