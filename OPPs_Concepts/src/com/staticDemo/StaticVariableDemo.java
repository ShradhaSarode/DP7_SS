package com.staticDemo;

public class StaticVariableDemo {

	public static void main(String[] args) {
		StaticVariable  s1= new StaticVariable ();
		s1.instanceMethod();
		System.out.println(StaticVariable.y);

	}

}
