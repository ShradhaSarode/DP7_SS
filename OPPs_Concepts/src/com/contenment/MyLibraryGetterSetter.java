package com.contenment;

public class MyLibraryGetterSetter
{

	public static void main(String[] args)
	{
		Author a1=new Author();
		a1.setAid(111);
		a1.setAname("ABC");
		
		Book b1=new Book();
		b1.setBid(123);
		b1.setBname("C#");
		b1.setPrice(45000f);
		b1.setAuthor(a1);
		
		Book b2=new Book();
		b2.setBid(456);
		b2.setBname("perl");
		b2.setPrice(40000f);
		b2.setAuthor(new Author());
		b2.getAuthor().setAid(111);
		b2.getAuthor().setAname("XYZ");
		
		
		
		System.out.println(b1);
		System.out.println(b2);


	}

}
