package com.StringAssignment;
/*
 3.Compare string using new operator when
  new is present see different reference is there
 */
public class ThirdQ
{
	public static void main(String[] args)
	{
		String s1=new String("Python");
		String s2=new String("Java");
		String s3=new String("Java");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println("-----------------");
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println(s2.compareTo(s3));
	}

}
