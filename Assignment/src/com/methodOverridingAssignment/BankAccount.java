package com.methodOverridingAssignment;
/*
 6) A bank has a principal amount and a rate of interest which is 2%.
  A savings account has a rate of interest 3% while a current account has 5%.
  Write a method that displays the rate of interest based on whether the account is default/ savings/ current.
 */
class Bank
{
	void display()
	{
		System.out.println("Default rate of interest which is 2%");
	}
}
class SavingsAccount extends Bank
{
	void display()
	{
		super.display();
		System.out.println("Saving rate of interest which is 5%");
	}
}
class CurrentAccount extends Bank
{
	void display()
	{
		super.display();
		System.out.println("Current rate of interest which is 3%");
	}
}
public class BankAccount
{
	public static void main(String[] args)
	{
		 Bank b1=new  Bank();
		 b1.display();
		 System.out.println("--------------------------------------------------");
		 SavingsAccount s1=new SavingsAccount();
		 s1.display();
		 System.out.println("--------------------------------------------------");
		 CurrentAccount c1=new CurrentAccount();
		 c1.display();
		 System.out.println("--------------------------------------------------");
		/*
		 double interestRate;
        switch (accountType.toLowerCase()) {
            case "savings":
                interestRate = 0.03; // 3% for savings account
                break;
            case "current":
                interestRate = 0.05; // 5% for current account
                break;
            default:
                interestRate = 0.02; // 2% for default account
                break;
        }
        System.out.println("Interest rate for " + accountType + " account: " + (interestRate * 100) + "%");
    }
		 */
	}

}
