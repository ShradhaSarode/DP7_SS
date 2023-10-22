package com.MLab;

import java.util.Arrays;

public class ContainNum {
	public static void containOnlyChar(String[] st) {
		int i;
		for (i = 0; i < st.length; i++) {
			for (int j = 0; j < st[i].length(); j++) {
				try {
					if (st[i].charAt(j) >= '0' && st[i].charAt(j) <= '9') {
						throw new InvalidStringException(st[i] + " " + "Only contain char not num....");
					}
				} catch (InvalidStringException e) {
					System.out.println(e.getMessage());
					// e.printStackTrace();
					break;
				}
			}
			System.out.println("String : " + st[i]);
		}
	}

	public static void main(String[] args) {
		String[] arr = { "java", "c", "angular1", "python2" };
		System.out.println(Arrays.toString(arr));
		containOnlyChar(arr);
	}

}
