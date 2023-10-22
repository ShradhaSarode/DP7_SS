package com.abstractcCass;
abstract class Student
{
	private int id;
	private String name;
	private float fees;
	private static String instName;
	static float discount;
	static
	{
		instName="Trinity College London";
	}
	Student()
	{
		
	}
	 Student(int id, String name, float fees)
	 {
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
	public static String getInstName() {
		return instName;
	}
	public static void setInstName(String instName) {
		Student.instName = instName;
	}
abstract void description();
	
	static float giveDiscount(int dis)
	{
		discount= dis;
		return discount;
	}
	final void display()
	{
		System.out.println("Student id:"+id);
		System.out.println("Combo Offer:"+discount+"%");
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Fees:"+fees);
		System.out.println("Institute Name:"+instName);
		System.out.println("Discounted cost:"+ (fees- ((discount/100)*fees)));
	}
}
class DanceStudent extends Student
{
	private int age;
	static private String danceStyle;
	
	DanceStudent()
	{
		
	}
	public DanceStudent(int id, String name, float fees,int age, String danceStyle) {
		super(id,name,fees);
		this.age = age;
		this.danceStyle = danceStyle;
	} 
	@Override
	void description()
	{	
		System.out.println("#Dance Academy!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("Age of student:"+age);
		System.out.println("DanceStyle:"+danceStyle);
	}
}
class MusicStudent extends Student
{
	private int yearOfStudy;
	private String instrument;
	MusicStudent()
	{
		
	}
	public MusicStudent(int id, String name, float fees,int yearOfStudy, String instrument) {
		super(id,name,fees);
		this.yearOfStudy = yearOfStudy;
		this.instrument = instrument;
	}
	@Override
	void description()
	{
		System.out.println("#Music Academy!!!!!!!!!!!!!!!!!");
		System.out.println("Year of study:"+yearOfStudy);
		System.out.println("Instrument:"+instrument);		
	}
}
class ArtStudent extends Student
{
	private int skillLevel;
	private String artMedium;
	ArtStudent()
	{
		
	}
	public ArtStudent(int id, String name, float fees,int skillLevel, String artMedium)
	{
		super(id,name,fees);
		this.skillLevel = skillLevel;
		this.artMedium = artMedium;
	}
	@Override
	void description()
	{
		System.out.println("#Art Academy!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("Skill Level:"+skillLevel);
		System.out.println("Art Medium:"+artMedium);
	}
}
public class AbstractDemo2
{
	public static void main(String[] args)
	{
		Student.giveDiscount(20);
		System.out.println("=====================================");
		DanceStudent d1=new DanceStudent(101,"Riya",2000f,16,"Salsa");
		d1.display();
		d1.description();
		System.out.println("=====================================");
		MusicStudent m1=new MusicStudent(111,"Siya",2500f,6,"Piano");
		m1.display();
		m1.description();
		System.out.println("=====================================");
		ArtStudent a1=new ArtStudent(1,"Piya",5500f,4,"Glass Art");
		a1.display();
		a1.description();
		System.out.println("======================================");
	}

}
