package com.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorIteratorModify {

	public static void main(String[] args) {
		Vector<String>lang=new Vector<>(5);
		lang.add("c");
		lang.add("c++");
		lang.add("python");
		lang.add(".net");
		lang.add("c++");
		System.out.println(lang);
		Enumeration<String>en=lang.elements();
		while(en.hasMoreElements())
		{
			if(en.nextElement().equals("c++"))
				lang.remove("c++");
		}
		System.out.println(lang);
	}

}
