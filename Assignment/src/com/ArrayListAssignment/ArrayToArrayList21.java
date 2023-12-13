package com.ArrayListAssignment;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class ArrayToArrayList21 {
	public static void main(String[] args) {
		String book[] = { "c", "c++", "java", "html", "c", "html", "html" };

		List<String> li = Arrays.asList(book);

		LinkedHashSet<String> lh = new LinkedHashSet<>(li);
		System.out.println("String ArrayToArrayList: "+lh);

		int arr[] = { 1, 2, 3, 4, 5 };

		Integer i1[] = new Integer[arr.length];

		for (int i = 0; i < arr.length; i++)
		{
			i1[i] = arr[i];
		}

		List<Integer> li1 = Arrays.asList(i1);

		System.out.println("Integer ArrayToArrayList: "+li1);
	}
}
