package com.encapsulation;

public class Libarary {

	public static void main(String[] args) {
		Book b1=new Book();
		//implicit //hard core values
		b1.setB_id(101);
		b1.setB_name("Harry Potter");
		b1.setB_price(890);
		System.out.println(b1.getB_id()+"  "+b1.getB_name()+"  "+b1.getB_price()+"  ");
		System.out.println(b1);

	}

}
