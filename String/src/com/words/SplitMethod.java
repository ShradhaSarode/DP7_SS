package com.words;

import java.util.Arrays;

public class SplitMethod
{
	public static void main(String[] args)
	{
		String str="a big cat is rolling on a big mat";
		System.out.println(str);
		String st[]=str.split("\\s");
		System.out.println(Arrays.toString(st));
	}

}
