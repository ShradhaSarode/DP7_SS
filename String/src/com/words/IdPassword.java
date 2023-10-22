package com.words;

import java.util.Scanner;

public class IdPassword {
	public static void generatePassword(String pass)
	{
		char ch[]=pass.toCharArray();
		int i;
		int special=0;
		int capital=0;
		int digit=0;
		int space=0;
		for(i=0;i<ch.length;i++)
		{
			if(pass.length()>8)
			{
	            	System.out.println("enter 8 digit password only ");
			}
		}
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]=='@'||ch[i]=='#')
			{
				System.out.println("special char is missing");
			}
		}
			
				/*
				if(ch[i]=='@'||ch[i]=='#')
				{
	  				if(ch[i]>0||ch[i]<9)
				    {
				        if(ch[i]>=65||ch[i]<=90)
				        {
				            if(ch[i]!=' ')
				              {
					            System.out.println("Password is correct!!!!!!!!");
				              }
					            else{
					            	System.out.println("enter password without space");
					            	}
					            }
				            else{
				            	System.out.println("enter 8 digit password only ");
				            	}
				            }
				        else{
				        	System.out.println("special char is missing");
				        	}
				        }
	  				else{
	  					System.out.println("enter any digit in password");
	  					}
	  				}
				else{
					System.out.println("enter any uppercase value");
					}
	  			}*/
		}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name:");
		String id = sc.next();
		System.out.println("Enter the password:");
		String password = sc.next();
		sc.close();
		generatePassword(password);
	}
}
