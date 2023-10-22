package com.string;

public class StringMethod {

	public static void main(String[] args)
	{
		String s1="java";
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(s1.length()-1));
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		
		System.out.println(s1.indexOf("fun"));
		
		System.out.println(s1.isEmpty());
		String s="";
		System.out.println(s.isEmpty());
		
		// trim
		
			 String st=" java   ";
			 System.out.println(st.length());
			 
			 st= st.trim();
			 System.out.println(st+st.length());
			 
			 // compareTo : int
			 // 
			 // equals : boolean- true/false
			 
			 System.out.println("Shivani".compareTo("Shivani")); // returns 0
			 
			 System.out.println("Megha".compareTo("Neetu")); //M<N by 1 value -1
			 
			 System.out.println("Neetu".compareTo("Megha"));
			 
			 System.out.println("Megha".compareTo("Parul"));
			 
			 // postive if 1st ascii char is greater
			 // negative if 1st  ascii is smaller
			 // same- 0
			 
			 // lexographical comparison
		
		String a1="java";
		String a2="python";
		
		System.out.println(a1.length()>a2.length());
		System.out.println(a1.compareTo(a2));
	}

}
