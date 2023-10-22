package com.StringBufferDemo;

public class StringBufferDemo {

	public static void main(String[] args)
	{
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());
		
		StringBuffer sb2=new StringBuffer("hello");
		System.out.println(sb2.capacity());
		
		StringBuffer sb3=new StringBuffer(5);
		System.out.println(sb3.capacity());
		
		sb3.append("java");
		System.out.println(sb3);
		System.out.println(sb3.capacity());
		
		sb3.append("world");
		System.out.println(sb3);
		System.out.println(sb3.capacity());
		
//		String s2="helloworld";
//		String s3="helloworld";
	}

}
