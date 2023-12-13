package com.hasSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*
Create a HashSet of student objects . { id , name , marks, course feespaid }
course { id name fees }

if student has paid complete fees , and his marks are more than 30 , give him grace marks so that he will pass by getting 35 marks . 
e.g student has 32 marks give him 3 marks more and make him pass 
Hashset must be updated with new marks
 */
/*
create a map in which coursename is a key and number of students in that course is value 
<"java" , 8>
<"angular" , 10>
create a map in which 
feespaid string will be key and number of students who paid fees is value 
and same for feesnotpaid
<"feespaid" , 5> 
<"feesnotpaid" , 12>
map will have only 2 entries 

create a map in which courseobject will be key and arraylist of student names will be value 
<course(1,java,9000) , arraylist{"suraj" , "kailash" }
 */
public class HashSetDemo {
	public static void countStudent(HashSet<Student> hset) {
		HashMap<String, Integer> newmap = new HashMap<>();
		int count;
		Iterator<Student> itr = hset.iterator();
		while (itr.hasNext()) {
			Student st = itr.next();
			if (newmap.containsKey(st.getCourse().getName())) {
				count = newmap.get(st.getCourse().getName());
				count++;
			} else
				count = 1;
			newmap.put(st.getCourse().getName(), count);
		}
		System.out.println(newmap);
	}

	public static void method(HashSet<Student> hset) {
		HashMap<String, Integer> newmap = new HashMap<>();
		int count;
		Iterator<Student> itr = hset.iterator();
		while (itr.hasNext()) {
			Student stud = itr.next();
			if (stud.getFeespaid() == stud.getCourse().getFees()) {
				count = newmap.get("feespaid");
				count++;
			} else
				count = 1;
			newmap.put("feespaid", count);
		}
		if (newmap.containsKey("feespaid")) {
			count = newmap.get("feespaid");
			count++;
		} else
			count = 1;
		newmap.put("unpaid", count);
		System.out.println(newmap);
	}
	public static void method1(HashSet<Student> hset)
	{
		HashMap<Course, ArrayList<String>> newmap = new HashMap<>();
	    ArrayList<String> stud = new ArrayList<>();
        stud.add("Suraj");
        stud.add("Kailash");
	}
	public static void main(String[] args) {
		HashSet<Student> hset = new HashSet<>();
		// int id, String name, int marks, int feespaid, Course course
		// String name, int id, int fees
		hset.add(new Student(101, "Viharika", 40, 4500, new Course("java", 111, 6000)));
		hset.add(new Student(105, "Niharika", 32, 8000, new Course("html", 555, 8000)));
		hset.add(new Student(103, "Sharivika", 85, 5000, new Course("css", 333, 6000)));
		hset.add(new Student(104, "Sejal", 30, 10000, new Course("java", 444, 10000)));
		hset.add(new Student(102, "Ayushka", 70, 9000, new Course("css", 222, 12000)));

		for (Student s : hset) {
			System.out.println(s);
		}
		System.out.println("---------------------------------------------------------------------");
		Iterator<Student> itr = hset.iterator();
		while (itr.hasNext()) {
			Student stud = itr.next();
			if (stud.getMarks() < 35 && stud.getMarks() >= 30) {
				int grace = 35 - stud.getMarks();
				stud.setMarks(stud.getMarks() + grace);
				System.out.println(stud + ":\nis passed with grace of: " + grace);
			}
		}
		System.out.println("-----------------------------------------------------");
		for (Student s : hset) {
			System.out.println(s);
		}
		System.out.println("-----------------------------------------------------");
		countStudent(hset);
		System.out.println("-----------------------------------------------------------");
		method(hset);
	}
}
