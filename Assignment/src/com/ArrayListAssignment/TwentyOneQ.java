package com.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//21.	WAP to convert collection into array
public class TwentyOneQ {
	public static void main(String[] args) {
//		int ar[]= {150,250,130,340,50,20};
//		System.out.println(Arrays.toString(ar));
//		List al=Arrays.asList(ar);
////		List<Integer>arl=Arrays.asList(ar);
//		List<int[]>arl=Arrays.asList(ar);
//		System.out.println(arl);
//       ArrayList<Integer> arlist = (ArrayList) al;
//		System.out.println(al.get(1));
//		
//		System.out.println("-------------------------------");
//		ArrayList<Integer>al2=new ArrayList<Integer>(al);
//		System.out.println(al2);
//		System.out.println("-----------------------------------");
//		ArrayList al3=new ArrayList<>();
//		Collections.addAll(al3, ar);
//		System.out.println(al3);
		System.out.println("-----------------------------------");

		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<String> al2 = new ArrayList<String>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(40);

		al2.add("mumbai");
		al2.add("pune");

		System.out.println("Arraylist : "+al);
		System.out.println("-----------------------------------");
		// convert arraylist to array (1st way)
		Object a[] = al.toArray();

		System.out.println("Arraylist to array: "+Arrays.toString(a));
		System.out.println("-----------------------------------");
		// 2nd way

		String arr[] = al2.toArray(new String[al2.size()]);
//		Integer arr1[]=new Integer[al.size()];
//		Integer in[]=al.toArray(arr1);
//		System.out.println(Arrays.toString(in));
//		System.out.println("-----------------------------------------");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------------------");
//can we make arrayList synchronized(yes by using Collections.synchronizedList)		
		List<String> li2 = Collections.synchronizedList(al2);
		li2.add("aaa");
		li2.add("bbb");
		System.out.println(li2);
		System.out.println("-----------------------------------");
	}
}
