package com.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo1
{
public static void main(String[] args)
{		
		PriorityQueue<String> pq= new PriorityQueue<>(Collections.reverseOrder());
		
        pq.add("Devops");
        pq.add("Java");
        pq.add("Angular");
        pq.add("SpringBoot");
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
		System.out.println(pq.offer("C++"));
		System.out.println(pq);
		
	}
}
