package com.queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args)
	{
		ArrayDeque<Float>adq=new ArrayDeque<>();
		System.out.println(adq.peekFirst());
//		System.out.println(adq.getFirst());
//		adq.addLast(null);// add  // not allows null
		adq.add(52.3f);
		adq.offerLast(63.2f);
		adq.addFirst(45.2f);
		
		// duplicate allowed
    	// maintains insertion order
		System.out.println(adq);
	
		System.out.println(adq.peekLast());
		System.out.println(adq.peekLast());
		
		System.out.println(adq.pollFirst());
		System.out.println(adq.removeFirst());
		
		adq.push(85.2f);// addFirst()
		System.out.println(adq);
		
		adq.push(23.2f);
		adq.push(65.2f);
		System.out.println(adq.pop());// addFirst()
		System.out.println(adq);
	}

}
