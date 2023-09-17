package com.inheritance;

class Student
{
	private int id;
	private String name;
	private float fees;
	
	public Student()
	{
		super();
	}

	public Student(int id, String name, float fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}
	public String toString()
	{
		return "Student id=" + id+ "\n"
				+ "name=" + name + "\n"
				+ "fees=" + fees + "\n";
	}
}
	class SchoolStudent extends Student
	{
		private int std;
		private String sname;
		
		public SchoolStudent()
		{
			super();
		}
		public SchoolStudent(int id, String name, float fees,int std, String sname)
		{
			super(id, name, fees);
			this.std=std;
			this.sname=sname;
		}
		public int getStd() {
			return std;
		}
		public void setStd(int std) {
			this.std = std;
		}
		public String getName() {
			return sname;
		}
		public void setName(String sname) {
			this.sname = sname;
		}
		public String toString()
		{
			return super.toString()+"SchoolStude std=" + std+"\n"
					+ "name=" + sname +"\n";
		}
		
	}
	class CollegeStudent extends Student
	{
		private int sem;
		private String course;
		private String university;
		
		public CollegeStudent() {
			super();
			
		}
		public CollegeStudent(int id, String name, float fees,int sem, String course, String university) {
			super(id, name, fees);
			this.sem=sem;
			this.course=course;
			this.university=university;
		}
		public int getSem() {
			return sem;
		}
		public void setSem(int sem) {
			this.sem = sem;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public String getUniversity() {
			return university;
		}
		public void setUniversity(String university) {
			this.university = university;
		}
		public String toString() {
			return super.toString()+"CollegeStud sem=" + sem+"\n"
					+ "course=" + course+"\n"
					+ "university=" + university +"\n";
		}
		
	}
public class Hierarichical
{
	public static void main(String[] args)
	{
		SchoolStudent s1=new SchoolStudent(101,"ss",45000f,10,"cambridge");
		CollegeStudent c1=new CollegeStudent(111,"rr",500000f,3,"BEIT","SRTM");
		
		System.out.println(s1);
		System.out.println(c1);

	}

}
