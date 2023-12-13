package com.ArrayListAssignment;

import java.util.ArrayList;

public class SecondQ
{
	public static void main(String[] args)
	{
		ArrayList arrayList = new ArrayList();
        arrayList.add(0, 42);
        arrayList.add(1, "Hello, World");
        for (Object element : arrayList)
        {
            if (element instanceof Integer)
            {
                System.out.println("Element at 0th location (Integer): " + element);
            }
            else if (element instanceof String)
            {
                System.out.println("Element at 1st location (String): " + element);
            }
        }
	}
}
