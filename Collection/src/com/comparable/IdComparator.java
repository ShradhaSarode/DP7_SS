package com.comparable;

import java.util.Comparator;

import com.comparator.Employee;

public class IdComparator implements Comparator<Book>
{

	@Override
	public int compare(Book b1, Book b2)
	{	
		return b1.getId()-b2.getId();
	}

}
