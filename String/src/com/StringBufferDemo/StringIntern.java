package com.StringBufferDemo;

public class StringIntern {

	public static void main(String[] args)
	{
		String s1="java";
		String s2=new String("java");
		//for memory management
		// faster comparison,we can compare with ==
		s2.intern();
		System.out.println(s1==s2);
		s2=s2.intern();
		System.out.println(s1==s2);
	}

}
