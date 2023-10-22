package com.looplogic;

import java.util.Scanner;

public class Krishnamurthy_num {

	
		static int factorial(int n)
		{
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        return n * factorial(n - 1);
	    }
	    static boolean isKrishnamurthy(int num) {
	        int originalNum = num;
	        int sumOfFactorials = 0;
	        
	        while (num > 0) {
	            int digit = num % 10;
	            sumOfFactorials += factorial(digit);
	            num /= 10;
	        }
	        
	        return sumOfFactorials == originalNum;
	    }
	    
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	
	        int num = 4563;
	        
	        if (isKrishnamurthy(num))
	        {
	            System.out.println(num + " is a Krishnamurthy number.");
	        }
	        else
	        {
	            System.out.println(num + " is not a Krishnamurthy number.");
	        }
	        sc.close();
	    }
	}

	


