package com.arrayList;

import java.util.ArrayList;

public class FrequencyArrayList
{
	public static void calFreq(ArrayList<String>list)
	{
		int count;
		for(int i=0;i<list.size();i++)
		{
			count=1;
			if(list.get(i).equals("visited"))
				continue;
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					count++;
					list.set(j, "visited");
				}
			}
			System.out.println(list.get(i)+"-------->"+count);
		}
	}
	public static void calDuplicate(ArrayList<String>list)
	{
		int count;
		for(int i=0;i<list.size();i++)
		{
			count=1;
			if(list.get(i).equals("visited"))
				continue;
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					count++;
					list.set(j, "visited");
				}
			}
			if(count>1)
			System.out.println(list.get(i)+"-------->"+count);
		}
	}
	public static void calUnique(ArrayList<String>list)
	{
		int count;
		for(int i=0;i<list.size();i++)
		{
			count=1;
			if(list.get(i).equals("visited"))
				continue;
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					count++;
					list.set(j, "visited");
				}
			}
			//System.out.println(list.get(i)+"-------->"+count);
			if(count==1)
				System.out.println(list.get(i)+"-------->"+count);
		}
	}
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("a");
		al.add("b");
		al.add("c");
		//calFreq(al);
//		calDuplicate(al);
		calUnique(al);
	}

}
