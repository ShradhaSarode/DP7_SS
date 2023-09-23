package com.methodOverridingAssignment;
	class Derived  
	{ 
	    public void getDetails(String temp) 
	    { 
	        System.out.println("Derived class " + temp); 
	    } 
	} 
	  
	public class TastOutput extends Derived 
	{ 
	    public void getDetails(String temp) 
	    { 
	        System.out.println("Test class " + temp); 
	       // return 0; 
	    } 
	    public static void main(String[] args) 
	    { 
	    	TastOutput obj = new TastOutput(); 
	        obj.getDetails("Hello"); 
	    } 
	} 
//Test class Hello=Output
