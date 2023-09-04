package com.labsession;

import java.util.Scanner;

public class Add_num_until_zero {

	public static void main(String[] args) {
	
		int sum =0;
		int i=1;;
		int count=0;
		while(i!=0)
		//for (i=1;i!=0;i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter numbers :");
			int num = sc.nextInt();
			count++;
			if(num==0)
			{
				break;
			}
			sum +=num;
			
			//sc.close();
		}
		//System.out.println(i);
		System.out.println("total num entered:"+count);
		System.out.println("Sum of entered digit:"+sum);
		
		
		
	}

}
