package com.varargs;

public class VarargsOverload
{
	static void show(int ...ar)
	{
		for(int i:ar)
		{
			System.out.println(i);
		}
	}
	static void show(float ...ar)
	{
		for(float i:ar)
		{
			System.out.println(i);
		}
	}
		static void show(String ...str)
		{
			for(String s:str)
			{
				System.out.println(s);
			}
		}
		static void display(int x,char ...str)
		{
			System.out.println(x);
			for(char s:str)
			{
				System.out.println(s);
			}
		}
		static void display(char x,int ...str)
		{
			System.out.println(x);
			for(int s:str)
			{
				System.out.println(s);
			}
		}
	public static void main(String[] args)
	{
		show(1,2,3,5,4,5);
		System.out.println("----------------------------------");
		show(4.5f,5.2f,6.3f);
		System.out.println("----------------------------------");
		show("s","r","p");
		System.out.println("----------------------------------");
		show(2,3,4);
		System.out.println("----------------------------------");
		show("Java","C","C++");
		System.out.println("----------------------------------");
		show(4.5f,87.9f);
		System.out.println("----------------------------------");
		//show(); Ambiguity
		display(1,'a','b');
		System.out.println("----------------------------------");
		display('a', 8,9,5);
		System.out.println("----------------------------------");
		display(8, 's','f','e');
		System.out.println("----------------------------------");
		
		//display(65,90,45,97); // ambiguity due to type promotion
	}

}
