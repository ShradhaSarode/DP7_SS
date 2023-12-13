package com.LinkedHashMap;

/*
 * 6.	WAP to create a LinkedHashMap which contains 
 * Strings as key and objects of different classes as value. Print the map contents and observe the order.
 */
import java.util.LinkedHashMap;
import java.util.Map;

class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student{name='" + name + "', age=" + age + '}';
	}
}

class Car {
	private String brand;
	private String model;

	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car{brand='" + brand + "', model='" + model + "'}";
	}
}

public class Sixth {
	public static void main(String[] args) {

		Map linkedHashMap = new LinkedHashMap();

		linkedHashMap.put("Student1", new Student("John", 20));
		linkedHashMap.put("Car1", new Car("Toyota", "Camry"));
		linkedHashMap.put("Student2", new Student("Alice", 22));
		linkedHashMap.put("Car2", new Car("Honda", "Accord"));

		System.out.println("LinkedHashMap content:");
		for (Object entryObj : linkedHashMap.entrySet()) {
			Map.Entry entry = (Map.Entry) entryObj;
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
