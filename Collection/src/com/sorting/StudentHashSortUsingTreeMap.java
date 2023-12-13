package com.sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.hashmap.Student;

public class StudentHashSortUsingTreeMap
{
	public static void sortByMarks(HashMap<Student, String> hm) {
		TreeMap<Student, String> tm = new TreeMap<>(new MarksComparator());
		tm.putAll(hm);

		for (Map.Entry<Student, String> e : tm.entrySet()) {
			System.out.println(e.getKey() + "--->" + e.getValue());
		}

	}

	public static void main(String[] args) {

		HashMap<Student, String> shm = new HashMap<>();
		shm.put(new Student(101, "Anuj", 83), "Java");
		shm.put(new Student(107, "Vishal", 87), "Python");
		shm.put(new Student(103, "Sahil", 56), "Java");
		shm.put(new Student(104, "Mira", 87), ".net");
		shm.put(new Student(105, "Parul", 50), "Python");
		shm.put(new Student(110, "Nilam", 95), "Python");

		for (Map.Entry<Student, String> e : shm.entrySet()) {
			System.out.println("Id:" + e.getKey());
			System.out.println("Details:" + e.getValue());
			System.out.println("---------------------------------------------------");
		}

		System.out.println("////////////////////////////////////////////////////");
		// decreasing order of marks

		sortByMarks(shm);
	}
}
