package collectionAssignmentsArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
 3. Create a arraylist of string. Add 7 days to list ( Monday , Sunday 
etc) Remove elements from list for which string length is more 
than 7
 */
public class ThirdQ {

	public static void main(String[] args)
	{
		ArrayList<String>al=new ArrayList<>(7);
		al.add("sunday");
		al.add("monday");
		al.add("tuesday");
		al.add("wednesday");
		al.add("thusday");
		al.add("friday");
		al.add("saturday");
		
		System.out.println(al);
		System.out.println("----------------------------------------------------");
		al.add("tuesday");
		al.add("friday");
		al.add("monday");
		System.out.println(al);
		System.out.println("----------------------------------------------------");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext())
		{
			if(itr.next().length()>=7)
			itr.remove();	
		}
		System.out.println(al);
	}

}
