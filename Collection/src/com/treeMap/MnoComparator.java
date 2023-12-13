package com.treeMap;

import java.util.Comparator;

public class MnoComparator implements Comparator<Customer> {

	public int compare(Customer o1, Customer o2) {
		
		return (int) (o1.getMno()-o2.getMno());
	}

}
