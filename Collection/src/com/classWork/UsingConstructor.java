package com.classWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

//Q4. Create a arraylist of Double using all three constructors of arraylist
@SuppressWarnings("unused")
public class UsingConstructor
{
	public static void main(String[] args)
	{
		ArrayList<Double>al=new ArrayList<>();
		al.add(2.5);
		al.add(5.7);
		System.out.println(al);
		//ArrayList()
		//ArrayList(int initialCapacity):
		//ArrayList(Collection<? extends E> c):
		ArrayList<Double>al2=new ArrayList<>(3);
		al2.add(8.3);
		al2.add(9.2);
		ArrayList<Double>al3=new ArrayList<>(new ArrayList<Double>(al2) );
		System.out.println(al3);
		 
			 
		 
	}

}
