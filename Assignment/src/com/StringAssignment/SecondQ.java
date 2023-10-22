package com.StringAssignment;
/*2.	Compare string using == when “” is
   present see same reference is there
*/
public class SecondQ
{
	public static void main(String[] args)
	{
		String s1="java";
		String s2="java";
		String s3="html";
		System.out.println("s1 hash code:"+s1.hashCode());
		System.out.println("s2 hash code:"+s2.hashCode());
		System.out.println("---------------------------------------");
		System.out.println("using same string");
		System.out.println("========================");
		System.out.println("using ==:");
		System.out.println(s1==s2);
		System.out.println("------------------------------------");
		System.out.println("using .equals:");
		System.out.println(s1.equals(s2));
		System.out.println("---------------------------------------");
		System.out.println("using different string");
		System.out.println("========================");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}

}
