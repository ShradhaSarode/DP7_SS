package com.staticDemo;

public class SampleStaticDemo {
	int x=10;
	static int y=10;
	void show()
	{
		x++;
		System.out.println("x:"+x);
		y++;
		System.out.println("y:"+y);
	}
	void display()
	{
		int y=20;
		System.out.println("y:"+y);
		System.out.println("y:"+SampleStaticDemo.y);
	}

	public static void main(String[] args) {
		SampleStaticDemo s1=new SampleStaticDemo();
		System.out.println("object s1:"+s1);
		s1.show();
		
		SampleStaticDemo s2=new SampleStaticDemo();
		System.out.println("object s1:"+s2);
		s2.show();
		
		y++;
		s2.display();

	}

}
