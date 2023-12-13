package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class BikeDetails {

	public static void main(String[] args) {
		LinkedList<Bike> blist = new LinkedList<>();
		blist.add(new Bike(101, "KTM", 100000, 2016));
		blist.addFirst(new Bike(105, "Bullet", 200000, 2009));
		blist.offerFirst(new Bike(102, "Bajaj-Platina", 750000, 2010));
		blist.addLast(new Bike(103, "FZ", 150000, 2015));
		blist.add(4, (new Bike(104, "Harlry-Davidson", 100000, 2014)));
		for (Bike b : blist) {
			System.out.println(b);
		}
		System.out.println("------------------------------------------");
		Collections.sort(blist);

		for (Bike b : blist) {
			System.out.println(b);
		}
		System.out.println("-----------------------------------------------------");
		Iterator<Bike> itr = blist.iterator();
		while (itr.hasNext()) {
			if (itr.next().getModelYear() <= 2010)
			{
				itr.remove();
			}
		}
		for (Bike b : blist) {
			System.out.println(b);
		}
		System.out.println("-----------------------------------------------------");
		ArrayList<Integer>al=new ArrayList<>();
		al.add(45);
		al.add(85);
		al.add(95);
		al.add(75);
		al.add(65);
		al.add(35);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
	}
}
