package com.constructor;

public class Bank {
	static void allocateStatus(Account a)
	{
		if(a.getBalance()<=0)
		{
			a.setStatus("Deactivate");;
		}
		else
		{
			a.setStatus("Activate");
		}
		
	}

	public static void main(String[] args) {
		Account a1=new Account(111,"ShradhaSarode",100251f,"Unknown");
		Account a2=new Account(112,"HarshadaPatil",200251f,"Unknown");
		Account a3=new Account(113,"NehaChoudhari",0f,"Unknown");
		Account a4=new Account(114,"GauriDusane",0f,"Unknown");
		Account a5=new Account(115,"MadhulikaGore",500251f,"Unknown");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
		allocateStatus(a1);
		allocateStatus(a2);
		allocateStatus(a3);
		allocateStatus(a4);
		allocateStatus(a5);
		
		System.out.println("----------After-------------------------------------------");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);

	}

}
