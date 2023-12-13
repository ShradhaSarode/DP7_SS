package com.comparable;

import java.util.Comparator;

import com.comparator.Employee;

public class PriceComparator implements Comparator<Book>
{
	@Override
	public int compare(Book b1, Book b2)
	{	
		if(b1.getPrice()==b2.getPrice())
		{
		return b1.getName().compareTo(b2.getName());
		}
		else
			return (int) (b2.getPrice()-b1.getPrice());
	}

}
