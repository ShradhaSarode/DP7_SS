package com.lab_static;

class Test
{
	int a = 20;
	String str = "java";
	Test(){
	System.out.println("in default constructor");
	}
	Test(int i , String s){
	this();
	a=i;
	str=s;
	}
	public static void  foo() {
	//this.i=10;
	//this.str="Angular";
	}
	public static void main(String[] args) {
	Test t1 = new Test(2,"spring");
	t1.foo();
	System.out.println(t1.a + " " + t1.str);
	}
	
}
