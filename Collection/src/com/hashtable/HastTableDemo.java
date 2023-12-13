package com.hashtable;

import java.util.Hashtable;

public class HastTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer,String>ht=new Hashtable<>();
		
//		ht.put(null, "Anonymous");  // no null keys and no null values
		//	ht.put(1, null);
		
		System.out.println(ht.put(2, "shahid"));
		System.out.println(ht.put(2, "hrishikesh"));
		ht.put(3, "Shradha");
		ht.put(4, "Pratiksha");
		ht.put(5, "Shivani");
		System.out.println(ht);
	}

}
