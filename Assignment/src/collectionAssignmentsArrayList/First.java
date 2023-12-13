package collectionAssignmentsArrayList;

import java.util.ArrayList;

//1. Show in program, that size of an arraylist dynamically changes
public class First
{
	
	public static void main(String[] args)
	{
		ArrayList<Integer>al=new ArrayList<>(5);
		al.add(23);
		al.add(45);
		al.add(74);
		al.add(56);
		al.add(63);
		System.out.println("ArrayList size: "+al.size());
		System.out.println("Before: "+al);
		System.out.println("-------------------------------");
		al.add(45);
		al.add(78);
		al.add(99);
		System.out.println("ArrayList size: "+al.size());
		System.out.println("After adding: "+al);
		System.out.println("-----------------------------------");
		al.remove(2);
		System.out.println("ArrayList size: "+al.size());
		System.out.println("After remove: "+al);
	}

}
