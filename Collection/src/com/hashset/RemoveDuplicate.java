package com.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("java");
		al.add("python");
		al.add("sql");
		al.add("java");
		al.add("python");
		al.add(".net");
		System.out.println(al);
		HashSet<String>hm=new HashSet<>(al);
		System.out.println(hm);
	}

}
