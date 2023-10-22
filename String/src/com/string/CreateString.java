package com.string;

public class CreateString {

	public static void main(String[] args)
	{
		String s1="java";
		String s2="java";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("=========================");
		String str1=new String ("java");
		String str2=new String("java");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println("=========================");
		String s3="java";
		String s4=new String("java");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}
