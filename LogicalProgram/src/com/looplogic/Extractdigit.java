package com.looplogic;

public class Extractdigit
  {
	static void extract(int num)
	{
		System.out.println("The digit num "+num+" are:");
		while(num!=0)
		{
			int r=num%10;
			num=num/10;
			System.out.println(r);
		}
	}
	public static void main(String[] args) {
		extract(5876);
		//reverse of number:6785
	}
}
