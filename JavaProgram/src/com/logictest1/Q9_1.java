package com.logictest1;

public class Q9_1 {
		public static void main(String[] args) {
			int i =5;
			i += 20 ;
			byte b1=8 ;
			b1 += 4;	
			int ans = i+b1;
			System.out.println(ans);

			
			int a = 5;
			int b =20;
			//System.out.println(a++);
			//System.out.println(--b);
			//System.out.println(--b);
			//System.out.println(b/a);
			//System.out.println(--a);
			//System.out.println(b++);
			System.out.println(a++ + --b + --b + b/a + --a * b++);
			System.out.println("a= " + a + " b= " + b);
			
			 short s1 = 2000;
		       short s2 = 320;
		       System.out.println(s1 + s2);
		       char c1 = 'd';
		       char c2 = 'e';
		       char c3 =(char)(c1 + c2);
		       System.out.println(c3);  

		     // int a= 20;
		       a |= 9;
		      System.out.println(" & " +a);

		} }

