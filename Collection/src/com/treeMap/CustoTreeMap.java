package com.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class CustoTreeMap {

	public static void main(String[] args)
	{
		TreeMap<Customer, Order> tmap= new TreeMap<>(new MnoComparator());
		
		tmap.put(new Customer(1, "Anuj", 987756098),new Order(101, "Laptop", 45000));
		tmap.put(new Customer(1, "Anuj", 987756098),new Order(102, "Pendrive", 1000));
		tmap.put(new Customer(2, "Nilam", 98878446),new Order(103, "Hardisk", 6300));
		tmap.put(new Customer(3, "Pratiksha", 90056789),new Order(104, "MobilePhone", 23000));
		tmap.put(new Customer(4, "Neha", 999004567),new Order(105, "Charger", 670));
		tmap.put(new Customer(5, "Dipti", 94458391),new Order(106, "Headphones", 7200));
		
		for(Map.Entry<Customer, Order>e: tmap.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("---------------------------------------------------");
		}
	}

}
