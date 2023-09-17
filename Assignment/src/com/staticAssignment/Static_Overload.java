package com.staticAssignment;
//5.See if you can overload static method, by using static keyword for 2nd overloaded method and without using static keyword.
public class Static_Overload
{
	 // Overloaded static method without the 'static' keyword
    public static void myMethod(int x)
    {
        System.out.println("Static method without 'static' keyword: " + x);
    }

    // Overloaded static method with the 'static' keyword
    public void myMethod(String str)
    {
        System.out.println("Static method with 'static' keyword: " + str);
    }

    public static void main(String[] args)
    {
    	Static_Overload s1 = new Static_Overload();

        // Call the static method without 'static' keyword
    	
    	Static_Overload.myMethod(10);

        // Call the static method with 'static' keyword
    	
        s1.myMethod("Hello, SS!");
    }

}
