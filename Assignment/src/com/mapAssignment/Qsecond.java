package com.mapAssignment;

import java.util.HashMap;

//2.	WAP to test a HashMap is empty or not
public class Qsecond {

	public static void main(String[] args)
	{
		HashMap<String,Float> hm=new HashMap();
		System.out.println("isEmpty: "+hm.isEmpty());
		System.out.println("--------------------------------------");
		hm.put(".net", 52.4f);
		System.out.println("isEmpty: "+hm.isEmpty());
		System.out.println("--------------------------------------");
		System.out.println(hm);
	}

}
