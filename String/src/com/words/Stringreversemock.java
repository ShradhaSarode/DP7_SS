package com.words;

public class Stringreversemock {
	static void reverseSt(String s) {
		String[] str = s.split("\\s");
		System.out.print("after: ");

		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i].length() > 6) {
				throw new InvalidStringException("length greater than 6");
			}
			else
			{
			System.out.print(str[i]);
			System.out.print(" ");
			}
		}
	}

	public static void main(String[] args) {
		String st = "i like to learn java";
		System.out.println("before: " + st);

		reverseSt(st);

		// before: i like to learn java
		// after: java learn to like i
	}

}
