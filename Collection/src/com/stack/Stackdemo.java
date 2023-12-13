package com.stack;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args)
	{
		Stack<String>names=new Stack<>();
		names.push("ritu");
		names.push("nitu");
		System.out.println(names.push("bitu"));
		names.push("kitu");
		names.push("rita");
		System.out.println(names);
		System.out.println(names.pop());
		System.out.println(names);
	}

}
