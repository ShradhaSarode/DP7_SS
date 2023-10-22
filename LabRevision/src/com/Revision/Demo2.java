package com.Revision;

import com.revision2.A;

//import com.Revision.A;
class D {
	void display() {
		A a1 = new A();
		// System.out.println(a1.i);
		// System.out.println(a1.j);
		// System.out.println(a1.k);
		System.out.println(a1.m);
	}
}

class E extends A {
	void display() {
		A a1 = new A();
//		System.out.println(i);
//		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
	}
}

public class Demo2 {
	public static void main(String[] args) {
		A a1 = new A();
//		B b1=new B();
//		C c1=new C();
		D d1 = new D();
		d1.display();

		E e1 = new E();
		e1.display();

	}
}
