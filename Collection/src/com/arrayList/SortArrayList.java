package com.arrayList;

import java.util.ArrayList;

public class SortArrayList
{
	public static void sortList(ArrayList<Integer>list)
	{
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)>(list.get(j)))
				{
					int temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);	
				}
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(47);
		al.add(56);
		al.add(74);
		al.add(20);
		al.add(63);
		al.add(85);
		al.add(10);
		System.out.println("before: "+al);
		sortList(al);
		System.out.println("after: "+al);
	}

}
