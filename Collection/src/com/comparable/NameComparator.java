package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.comparator.Employee;

public class NameComparator implements Comparator<Book>
{

	@Override
	public int compare(Book b1, Book b2) {
		
		return b1.getName().compareTo(b2.getName());
	}
	
}
