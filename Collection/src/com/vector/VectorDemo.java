package com.vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args)
	{
		Vector<String>lang=new Vector<>(5);
		System.out.println(lang.capacity());
		System.out.println(lang.size());
		System.out.println("-------------------------------");
		lang.add("c");
		lang.add("c++");
		lang.add("python");
		lang.add(".net");
		lang.add("angular");
		System.out.println(lang);
		System.out.println(lang.capacity());
		System.out.println(lang.size());
		System.out.println("-------------------------------");
		lang.add("html");
		System.out.println(lang.capacity());
		System.out.println(lang.size());
		System.out.println("-------------------------------");
		System.out.println(lang.get(3));
		System.out.println(lang.elementAt(4));
		System.out.println("-------------------------------");
		System.out.println(lang.remove(4));
		System.out.println(lang.removeElement("c++"));
		System.out.println("-------------------------------");
		System.out.println(lang);
		System.out.println(lang.set(1, "springBoot"));
		lang.setElementAt("aws", 0);
		System.out.println(lang);
	}

}
