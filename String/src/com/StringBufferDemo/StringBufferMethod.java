package com.StringBufferDemo;

public class StringBufferMethod {

	public static void main(String[] args)
	{
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());
		sb1.append("java program");
		//reverse
		System.out.println(sb1.reverse());
		sb1.reverse();
		//replace
		sb1.replace(0, 1, "p");
		System.out.println(sb1);
		sb1.replace(1, 4, "p");
		System.out.println(sb1);
		sb1.replace(0, 1, "java");
		System.out.println(sb1);
		System.out.println(sb1.insert(6, "developer"));
		System.out.println(sb1.length());
		System.out.println(sb1.charAt(0));
		System.out.println(sb1.deleteCharAt(4));
		System.out.println(sb1.indexOf("program"));
		sb1.setCharAt(1, 'b');
		System.out.println(sb1);
		System.out.println(sb1.substring(3));
		System.out.println(sb1.substring(3, 6));
		
		
	}

}
