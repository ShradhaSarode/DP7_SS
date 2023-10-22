package com.revision;

public class Wrapper
{
	public static void main(String[] args)
	{
		boolean status=true;
		Boolean b=new Boolean(false);
		Boolean b1=Boolean.valueOf(true);
		int num=23;
		Integer i=new Integer(45);
		
		Integer j=  Integer.valueOf(num);
	
		Integer k=num;
		System.out.println(i+"  "+j+"  "+k+" "+b+" "+b1);
		System.out.println("-------------------------------------------");
		
		Float f1=new Float(23.4f);
		float f2=f1.floatValue();
		
		Float f3=f1;
		System.out.println(f1+"  "+f2+"  "+f3);
	}

}
