package com.words;

public class StringReverse2 {
	static void reverseStringWordByWord(String str) {
		String strarr[] = str.split("\\s");// {india,is,..}
		String rev = "";
		for (int i = 0; i < strarr.length; i++) {
			String str1 = strarr[i];// india
			for (int j = str1.length() - 1; j >= 0; j--) {
				rev += str1.charAt(j);
			}
			rev += " ";
		}
		System.out.println(rev);
	}

	public static void main(String[] args) 
	{
		String str = "india is a beautiful country";
		reverseStringWordByWord(str);//aidni si a lufituaeb yrtnuoc 
	}
}
