package com.arrayList;

import java.util.ArrayList;

public class ReverseArrayList
{
	public static void reverseList(ArrayList<String>list)
	{
		for(int i=0,j=list.size()-1;i<list.size()/2;i++,j--)
		{
			String temp=list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
	}
	public static void main(String[] args)
	{
		ArrayList<String>al=new ArrayList<>();
		al.add("mango");
		al.add("kiwi");
		al.add("banana");
		al.add("orange");
		al.add("cherry");
		System.out.println("before: "+al);
		reverseList(al);
		System.out.println("after: "+al);

	}

}
