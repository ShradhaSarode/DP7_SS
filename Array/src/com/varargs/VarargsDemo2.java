package com.varargs;

public class VarargsDemo2
{
	static void method(int n,int n1)
	{
		System.out.println(n+n1);
	}
	static void method(int n,int n1,int n2)
	{
		System.out.println(n+n1+n2);
	}
	static void method2(int ...n )
	{
		int sum=0;
		for(int i:n)
		{
			sum +=i;
		}
		System.out.println("Sum:"+sum);
	}
	//Rule 1:there can be only 1 varargs
//	static void show(int ...a,String ...s)
//	{
//		
//	}
	//Rule 2:last argument in the method
	static void print(int n,String ...str)
	{
		System.out.println(n);
		for(String s:str)
		{
			System.out.println(s);
		}
	}
//	static void print(int n,String ...str,float f)
//	{
//		System.out.println(n);
//		for(String s:str)
//		{
//			System.out.println(s);
//		}
//	}
	public static void main(String[] args)
	{
		method(5,3);
		System.out.println("----------------------------------");
		method(8,6,3);
		System.out.println("----------------------------------");
		method2(5,2,3);
		System.out.println("----------------------------------");
		method2(2,4,5,2,3);
		System.out.println("----------------------------------");
		method2(8,9,4,3,5,2,3);
		System.out.println("----------------------------------");
		//show(5,2,3,"s","r","t"); //Rule 1:
		
		print(9,"ritu","nitu","bitu");//Rule 2:
		System.out.println("----------------------------------");
		//print(9,"ritu","nitu","bitu",5.2f);//Rule 2:
	}

}
