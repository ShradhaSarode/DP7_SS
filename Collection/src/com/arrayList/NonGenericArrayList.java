package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class NonGenericArrayList {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List list1=new ArrayList<>();
		list1.add(12);
		list1.add("ritu");
		list1.add(56.4f);
		list1.add('A');
		System.out.println(list1);
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
			int data=(int)list1.get(i)+10;
			list1.set(i, data);
		}
		System.out.println(list1);
	}

}
