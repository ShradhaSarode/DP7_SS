package com.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args)
	{
		LinkedList<String>itcomp=new LinkedList<>();
//		System.out.println(itcomp.remove());
		System.out.println(itcomp.peek());
		System.out.println(itcomp.getFirst());
		itcomp.add("dell");
		itcomp.add("hp");
		itcomp.add(null);
		itcomp.add("tcs");
		System.out.println(itcomp);
		itcomp.addFirst("infosys");
		itcomp.add(1, "amazon");
		System.out.println(itcomp);
		System.out.println("----------------------");
		System.out.println(itcomp.element());
		System.out.println(itcomp.getFirst());
		System.out.println(itcomp.peek());
		System.out.println(itcomp.peekFirst());
		
	}

}
