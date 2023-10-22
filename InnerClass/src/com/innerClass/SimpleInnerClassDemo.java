package com.innerClass;
class Bank
{
	private String bname="SBI";
	String bankLoc;
	String ifscCode;
	String aName;
	int accNo;
	{
		bankLoc="Nanded";
		ifscCode="SBYPN1002";
	}
	Bank()
	{
		
	}
	Bank(int accNo,String aName)
	{
		this.accNo=accNo;
		this.aName=aName;
	}
	void displayBankDetails()
	{
		System.out.println("Bank name:"+bname+"\nLocation:"+bankLoc);
		System.out.println("IFSC code"+ifscCode);
	}
	class Locker
	{
		int lockerId;
		String password;
		static float lockerRent=2000;
		public Locker()
		{
			super();
		}
		public Locker(int lockerId, String password) {
			super();
			this.lockerId = lockerId;
			this.password = password;
		}
		void displayLockerDetails()
		{
			displayBankDetails();
			System.out.println("**********************");
			System.out.println("This locker belongs to:"+aName+" with acc num:"+accNo);
			System.out.println("Locker Id:"+lockerId);
			System.out.println("Rent for the locker:"+lockerRent);
		}
	}
}
public class SimpleInnerClassDemo
{
	public static void main(String[] args)
	{
		//1 way
		Bank cust1=new Bank(123466,"Ritu");
		cust1.displayBankDetails();
		System.out.println("-------------------------------------------");
		Bank.Locker l1=cust1.new Locker(101,"$arode06");
		l1.displayLockerDetails();
		System.out.println("-------------------------------------------");
		//2  way
		Bank.Locker cust2=new Bank(12396547,"Nitu").new Locker(103,"S@rode06");
		cust2.displayLockerDetails();
	}

}
