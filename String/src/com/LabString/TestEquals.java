package com.LabString;

public class TestEquals {

	public static void main(String[] args)
	{
		String s1="java";
		String s2=new String ("java");
		System.out.println("using double equal sign:"+s1==s2);
		System.out.println("Length of s1:"+s1.length());
		System.out.println("s1 hash code:"+s1.hashCode());
		System.out.println("s2 hash code:"+s2.hashCode());
		System.out.println("Using .equals:"+s1.equals(s2));
	}

}
