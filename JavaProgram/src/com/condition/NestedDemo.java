package com.condition;

//import java.util.Scanner;

public class NestedDemo {
	public static void main(String[] args) {
		float per = 57f;

		if (per >= 65) {
			System.out.println("Eligible for collage..............");
			if (per >= 80) {

				System.out.println(" can opt science & commarce stream");
			} else {
				System.out.println(" can opt commarce stream");
			}
		} else {
			System.out.println("not eligible for collage...........");
			// scanner.close();
		}
	}

}
