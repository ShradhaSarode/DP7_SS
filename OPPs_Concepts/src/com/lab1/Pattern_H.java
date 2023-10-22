package com.lab1;
/*
 
*            *
*            *
********
*            *
*            *
*            *

 */
public class Pattern_H {

	public static void main(String[] args)
	{
		int rows = 7; 
        int cols = 5;

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= cols; j++)
            {
                if (j == 1 || j == cols || i == 4)//i==(rows / 2 )+ 1
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
		

	}

}
