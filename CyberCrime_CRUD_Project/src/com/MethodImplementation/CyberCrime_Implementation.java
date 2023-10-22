package com.MethodImplementation;

import java.util.Scanner;

import com.InterfaceMethod.CyberCrime_Interface_Method;
import com.POJO_Class.CyberCrime;

public class CyberCrime_Implementation implements CyberCrime_Interface_Method
{
	static Scanner sc=new Scanner(System.in);
	CyberCrime cc[]=new CyberCrime[10];
	
	int section,peneltyAmount;
	String crime,accused_name;
	
	int count=0;
	@Override
	public boolean addCrime()
	{
		System.out.println("Add Crime Details here....");
		System.out.println("Enter number of crime you want to add:");
		int c=sc.nextInt();
		for(int i=0;i<c;i++)
		{
			System.out.println("Enter section:");
			 section=sc.nextInt();
			System.out.println("Enter crime:");
			crime=sc.next();
			System.out.println("Enter accused name:");
			//accused_name=sc.next();
			accused_name=sc.next();
			System.out.println("Enter Penelty Amount:");
			//peneltyAmount=sc.nextInt();
			peneltyAmount=sc.nextInt();
			cc[count]=new CyberCrime(section,crime,accused_name,peneltyAmount);
			count++;
		}
		System.out.println("Crime added Sucessfully!");
		return true;
	}

	@Override
	public boolean showCrime()
	{
		for(int i=0;i<count;i++)
		{
			if(cc[i]!=null)
			{
			System.out.println(cc[i]);
			}
		}
		return true;
	}

	@Override
	public boolean updateCrime()
	{
		System.out.println("Update accused details:");
		  System.out.println("Enter the section you want to Update:");
		  int section=sc.nextInt();
		  for(int i=0;i<count;i++)
			{
		         if(section==cc[i].getSection() && cc[i]!=null)
		         {
		        	 System.out.println("Enter crime:");
		        	crime=sc.next();
		        	 cc[i].setCrime(crime);
		        	 System.out.println("Enter accused name");
		        	 accused_name=sc.next();
		        	 cc[i].setAccuse_name(accused_name);
		        	 System.out.println("Enter penelty Amount");
		        	 peneltyAmount=sc.nextInt();
		        	 cc[i].setPeneltyAmount(peneltyAmount);
		         }
			}
		  System.out.println("Crime details Update Sucessfully");
		  System.out.println("----------------------------------------------------------");
		return true;
	}

	@Override
	public boolean deleteCrime()
	{
		 System.out.println("Delete accused detail here.....");
		  System.out.println("Enter the section you want to delete:");
		  int section=sc.nextInt();
		  for(int i=0;i<count;i++)
			{
		         if(section==cc[i].getSection())
		         {
		        	 cc[i]=null;
		         }
		         
			}
		  System.out.println("Delete accused detail Sucessfully!");
		  System.out.println("----------------------------------------------------------");
		return true;
	}
	@Override
	public boolean searchCrime()
	{
		System.out.println("Search CyberCrime here....");
		  System.out.println("Enter the section you want to search:");
		  int section=sc.nextInt();
	
		  boolean status=false;
		  int i;
		  for( i=0;i<count;i++)
			{     
		        	if(cc[i]!=null &&cc[i].getSection()==section )
		        	{
		        	 status=true;
		        	 break;  	
	              }
            }
		  if(status==true)
		
		  {
			  System.out.println("Given accused details are Available");
			  System.out.println(cc[i]);
		  }
		  else
			  System.out.println("Given accused details are not available");
		  System.out.println("----------------------------------------------------------");
		return true;
		
	}
}
