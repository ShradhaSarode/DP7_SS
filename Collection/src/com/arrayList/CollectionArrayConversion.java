package com.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionArrayConversion {

	public static void main(String[] args)
	{
		String colours[]= {"red","blue","green","yellow"};
		//System.out.println(colours);
		//Arrays.sort(colours);
		//1 way
		List<String>al=Arrays.asList(colours);
		System.out.println(al);
		
		//2 way
		ArrayList<String>al2=new ArrayList<String>(Arrays.asList(colours));
		System.out.println(al2);
		
		//3 way
		ArrayList<String>al3=new ArrayList<>();
		Collections.addAll(al3, colours);
		System.out.println(al3);
		System.out.println("-----------------------------------");
		//////////////////////////////////////////////////////////
		//convert arraylist to array
		Object []col=al2.toArray();
		System.out.println(Arrays.toString(col));
		for(int i=0;i<col.length;i++)
		{
			col[i]=((String)col[i]).concat("colour");
		}
		System.out.println(Arrays.toString(col));
		
		String [] cols=new String[al2.size()];
		al2.toArray(cols);
		for(int i=0;i<col.length;i++)
		{
			cols[i]=cols[i].concat("colour");
		}
		System.out.println(Arrays.toString(cols));
	}

}
