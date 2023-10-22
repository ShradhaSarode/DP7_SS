package com.classWork;

import java.util.ArrayList;

/*
 Q3. Create an arraylist of Integer and implement following methods
    1. get method
    2. set method
    3. retainAll
    4. removeAll
    5. add method
 */
public class ArrayListMethod {

	public static void main(String[] args)
	{
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(85);
		al.add(23);
		al.add(41);
		al.add(63);
		al.add(78);
		al.add(96);
		System.out.println(al);
		System.out.println("------------------------------------");
		for(int i=0;i<al.size();i++)
		{
			//Returns the element at the specified position in this list.
			System.out.println(al.get(i));
		}
		System.out.println("------------------------------------");
			//Replaces the element at the specified position in this list withthe specified element.
			al.set(4, 55);
			System.out.println(al);
			System.out.println("------------------------------------");
			System.out.println(al.get(4));
			System.out.println("------------------------------------");
			ArrayList<Integer>al2=new ArrayList<>(5);
			al2.add(11);
			al2.add(22);
			al2.add(33);
			al2.add(44);
			al2.add(55);
			al2.add(66);
			al2.add(77);
			al2.add(88);
			System.out.println(al2);
			System.out.println("------------------------------------");
			al2.remove(7);
			/*
			Removes the element at the specified position in this list.
			Shifts any subsequent elements to the left (subtracts one from theirindices).
			*/
			System.out.println(al2);
			System.out.println("------------------------------------");
			al.retainAll(al2);
			/*
			 Retains only the elements in this list that are contained in thespecified collection.
			 In other words, removes from this list allof its elements that are not contained in the specified collection.
			 */
			System.out.println(al);
			System.out.println("------------------------------------");
	}

}
