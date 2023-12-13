package com.StringLogical;

import java.util.Arrays;

//find out if 2 strings are anagram of each other using substring.
//"angular"
public class AnagramWithoutSorting 
{
	public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        // Sort substrings and compare
        char[] s1Array = sortSubstring(s1);
        char[] s2Array = sortSubstring(s2);

        return Arrays.equals(s1Array, s2Array);
    }
	private static char[] sortSubstring(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return charArray;
    }
	public static void main(String[] args) {
        String str1 = "angular";
        String str2 = "ularang";

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

}
