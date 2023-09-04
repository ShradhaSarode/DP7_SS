//WAP to show the use of break statement ( in for loop)
package com.loopassign2;

public class Break {

	public static void main(String[] args)
	{
		char ch='a',ch1='z',ch2='m';
		
		for(int i=ch;i<ch1;i++)
		{
			System.out.println(i);
			if(i==ch2)
				break;
		}
		

	}

}
