package com.labAbstractClassInterface;

public class Wrapper
{
	public static void main(String[] args)
	{
		
		int num=45;
		char ch='a';
		Character c2=Character.valueOf((char) 97);
		System.out.println(c2);
		int c=97;
		Integer i=new Integer(51);
		Integer j=Integer.valueOf(num);
		Character c1=new Character('A');
		
		
		
		System.out.println(i+" "+j);
		System.out.println(c1+" "+c2);
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.valueOf(c));
		
	}

}
