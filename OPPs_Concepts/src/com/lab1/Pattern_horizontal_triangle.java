package com.lab1;

public class Pattern_horizontal_triangle {

	public static void main(String[] args) {
		int rows = 5; 

        // top half 
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //  bottom half 
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 
 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *
 
 
*/