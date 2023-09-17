package com.contenment;

public class MyCollageGetterSetter {

	public static void main(String[] args) {
		Course c1=new Course();
		c1.setCid(123);
		c1.setName("full stack");
		c1.setFees(45000f);
		
		Student s1=new Student();
		s1.setSid(456);
		s1.setSname("aaa");
		s1.setCourse(c1);
		System.out.println(s1);
		
		Student s2=new Student();
		s2.setSid(444);
		s2.setSname("sarode");
		
		s2.setCourse(new Course());
		s2.getCourse().setCid(789);
		s2.getCourse().setName("opps");
		s2.getCourse().setFees(45321f);
		
		System.out.println(s2);

	}

}
