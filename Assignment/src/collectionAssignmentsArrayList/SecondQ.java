package collectionAssignmentsArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
2. Create a arraylist of integers. Add first 50 odd numbers to 
arraylist.
 */
public class SecondQ
{
	public static void main(String[] args)
	{
//		ArrayList<Integer> oddNumbersList = new ArrayList<>();
//		int num = 1;
//        while (oddNumbersList.size() < 50)
//        {
//            if (num % 2 != 0)
//            { 
//                oddNumbersList.add(num);
//            }
//            num++;
//        }
//        System.out.println("ArrayList of the first 50 odd numbers:");
//        System.out.println(oddNumbersList);
	

	ArrayList<Integer> al = new ArrayList<>(50);
	for (int i = 1; i <= 50; i++)
	{
		al.add(i);
	}
//	System.out.println(al);
	Iterator<Integer> itr = al.iterator();
	while (itr.hasNext()) {
			int n = itr.next();
			if (n % 2 != 0)
				System.out.println(n);
		}
	}
}
	
