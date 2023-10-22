package com.LabArrayList;

import java.util.ArrayList;

/*
 create arraylist of strings 
find position of string given by the user .
{ "suraj" , "vishal" , "kailas" , "pralay" } 
user enters "vishal" 
output - vishal is as second position
 */
public class StringArrayList {

	public static void main(String[] args)
	{
		ArrayList<String>al=new ArrayList<>();
		al.add("ritu");
		al.add("nitu");
		al.add("bitu");
		al.add("kitu");
		System.out.println(al);
		System.out.println(al.get(1));
		for(int i=0;i<al.size();i++)
		{
			al.indexOf(1);
		}
	}

}
