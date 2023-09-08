package com.lab1;

public class Pattern_12 {

	public static void main(String[] args) {
		/*
		    11
		   1221
		  123321
		    
		 */
 

		int n = 3; 

        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

           
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            
            System.out.println();
        }
	}

}
