package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {

	public static void main(String[] args)
	{
		ArrayList<String>al=new ArrayList<>();
		al.add("java");
		al.add("python");
		al.add("angular");
		al.add("spring");
		al.add("html");
		System.out.println("before: "+al);
		
		Iterator<String>itr=al.iterator();
		while(itr.hasNext())
		{
			if(itr.next().equals("angular"));
			//al.remove("angular");
			itr.remove();
		}
		System.out.println("after: " +al);
	}
}
