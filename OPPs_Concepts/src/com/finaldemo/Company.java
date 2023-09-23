package com.finaldemo;
final class Developer
{
	final static int noOfHoure;
	String cName;
	final float salary;
	String ename;
	static
	{
		noOfHoure=8;
	}
	{
		//noOfHoure=18;
		cName="HCL";
	}
	 Developer()
	{
		this.salary = 500000f;
		
	}
	public Developer(String cName, float salary, String ename) {
		super();
		this.cName = cName;
		this.salary = salary;
		this.ename = ename;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getNoOfHoure() {
		return noOfHoure;
	}
	public String getcName() {
		return cName;
	}
	public float getSalary() {
		return salary;
	}
	final void skills()
	{
		System.out.println("HTML,CSS,JS,C,C++");
	}
//	class FullStackDeveloper extends Developer
//	{
//		void skills()
//		{
//			System.out.println("HTML,CSS,JS,C,C++");
//		}
//	}
}
public class Company {

	public static void main(String[] args)
	{
		Developer d=new Developer();
		d.setEname("Shradha");
		System.out.println(d.cName+" "+d.ename+" "+d.salary);
	
		Developer d1=new Developer();
		System.out.println(d1.cName+" "+d1.ename+" "+d1.salary);
		//d1.salary=650000f;
		d.skills();
	//	d1.skills();
	}

}