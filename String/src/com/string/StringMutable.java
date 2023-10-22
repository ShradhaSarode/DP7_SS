package com.string;

public class StringMutable {

	public static void main(String[] args)
	{
		String s1="java";
		System.out.println(s1.hashCode());
		s1="corejava";
		System.out.println(s1.hashCode());//diff hash code
		System.out.println(s1);
		
		String s2="ritu";
		System.out.println(s2.hashCode());
		s2.concat("sarode");
		System.out.println(s2.hashCode());
		System.out.println(s2);
		
		String s3="ritu";
		System.out.println(s3.hashCode());
		s3=s3.concat("sarode");
		System.out.println(s3.hashCode());
		System.out.println(s3);
		
		String s4="ritusarode";
		System.out.println(s4.hashCode());
		
//		int num=45;
//		System.out.println(num+45);
//		System.out.println(num);
	}

}
