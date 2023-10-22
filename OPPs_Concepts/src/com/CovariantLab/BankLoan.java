package com.CovariantLab;
class Loan
{
	int lid;
	String type;
	Loan()
	{
		
	}
	public Loan(int lid, String type)
	{
		super();
		this.lid = lid;
		this.type = type;
	}
	public String display()
	{
		return "Loan id:"+lid+"\nLoan type:"+type+"\n";
	}
}
class CarLoan extends Loan
{
	float cintRate;
	CarLoan()
	{
		
	}
	public CarLoan(int lid, String type,float cintRate)
	{
		super(lid,type);
		this.cintRate=cintRate;
    }
	public String display()
	{
		return super.display()+"CarLoan interest Rate:"+cintRate;
	}
}	
class HomeLoan extends Loan
{
	float hintRate;
	HomeLoan()
	{
		
	}
	public HomeLoan(int lid, String type,float hintRate)
	{
		super(lid,type);
		this.hintRate=hintRate;
    }
	public String display()
	{
		return super.display()+"HomeLoan interest Rate:"+hintRate;
	}
}
class EducationLoan extends Loan
{
	float eintRate;
	EducationLoan()
	{
		
	}
	public EducationLoan(int lid, String type,float eintRate)
	{
		super(lid,type);
		this.eintRate=eintRate;
    }
	public String display()
	{
		return super.display()+"EducationLoan interest Rate:"+eintRate;
	}
}
class Bank extends Loan
{
	Loan provideLoan()
	{
		System.out.println("Loan Available:");
		return  new Loan();	
	}
}
class HDFC extends Bank
{
	HomeLoan provideLoan()
	{
		System.out.println("HomeLoan from HDFC:");
		return new HomeLoan();
	}
}
class ICICI extends Bank
{
	CarLoan provideLoan()
	{
		System.out.println("CarLoan from ICICI Bank:");
		return new CarLoan();	
	}
}
class SBI extends Bank
{
	EducationLoan provideLoan()
	{
		System.out.println("EducationLoan from SBI Bank: ");
		return new EducationLoan();	
	}
}
public class BankLoan
{
	public static void main(String[] args)
	{
		Bank b;
		b=new Bank();
		b.provideLoan();
		
		b= new HDFC();
		HomeLoan h1=new HomeLoan(222,"Home Loan",12.5f);
		b.provideLoan();
		
		b= new ICICI();
		CarLoan c1=new CarLoan(111,"CarLoan",11f);
		b.provideLoan();
		
		b=new SBI();
		EducationLoan  l1=new EducationLoan(101,"Education Loan",10.5f);
		  b.provideLoan();
		System.out.println("==========================================");
		 System.out.println(h1.display());
		 System.out.println("-----------------------------------------------------------------------");
		 System.out.println(c1.display());
		 System.out.println("-----------------------------------------------------------------------");
		 System.out.println(l1.display());
		 System.out.println("-----------------------------------------------------------------------");
	}

}
