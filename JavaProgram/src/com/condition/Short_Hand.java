package com.condition;

public class Short_Hand {
	public static void main(String[] args)
	{
		byte b1=54;
		byte b2=74;
		b1=(byte)(b1+b2);
		System.out.println(b1);
		byte num1=23;
		byte num2=54;
		num1+=num2;//remove type casting
		System.out.println(num1);
		short s1=95;
		short s2=63;
		//short pro;
		s1*=s2;
		System.out.println(s1);
		char ch=8;
		int v1=ch;//ASCII value of 8 is 56
		System.out.println(ch);
		System.out.println(v1);
		char ch1=48;
		char ch2=97;
		System.out.println(ch1+" "+ch2);
		char ch3=1;
		char ch4='1';
		System.out.println(ch3+" "+ch4);
	
		
	}

}
