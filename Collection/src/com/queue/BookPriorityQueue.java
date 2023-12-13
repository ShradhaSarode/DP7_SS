package com.queue;

import java.util.PriorityQueue;

public class BookPriorityQueue {

	public static void main(String[] args)
	{
		//PriorityQueue<Book> bookpq= new PriorityQueue<>(new PriceComparator());
        PriorityQueue<Book> bookpq= new PriorityQueue<>();
		bookpq.add(new Book(101, "TheSecret", 890));
		bookpq.add(new Book(103, "Ramayan", 250));
		bookpq.add(new Book(102, "HarryPotter", 1100));
		bookpq.add(new Book(104, "Life", 250));

		for (Book b : bookpq) {
			System.out.println(b);
		}

	}

}
