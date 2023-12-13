package com.ArrayListAssignment;

import java.util.ArrayList;

//12.	WAP to test an ArrayList is empty or not
public class TwelveQ
{

	public static void main(String[] args)
	{
		ArrayList<String>list=new ArrayList<>();
		list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("before emptying: " + list);
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println("after emptying: " + list);
        System.out.println(list.isEmpty());
        System.out.println("-----------------------------------------------------");
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        System.out.println("before clearing: " + arrayList);
        System.out.println(arrayList.isEmpty());
        arrayList.clear();
        System.out.println("after clearing: " + arrayList);
        System.out.println(arrayList.isEmpty());
	}

}
