package com.opps;

public class Students {
	int sId;
	String name;
	float marks;
	

	void display() {
		System.out.println("StudentId is:" + sId+"\n"+
				"name:" + name +"\n"+
				"marks:" + marks +"\n"
				);
	}

	public static void main(String[] args) {
		Students s1=new Students();
		s1.sId=701;
		s1.name="siya";
	    s1.marks=89f;
	    s1.display();
	    
	    Students s2=new Students();
		s2.sId=702;
		s2.name="riya";
	    s2.marks=80f;
	    s2.display();
	    
	    Students s3=new Students();
		s3.sId=703;
		s3.name="piya";
	    s3.marks=85f;
	    s3.display();

	}

}
