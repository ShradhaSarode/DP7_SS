package com.looplogic;

public class Methodcalling {
	static void factNum(int n)//formal/dummy argument
	{
		long fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
		//n+=5;
		//System.out.println(n);
		//Ctrl+7 : to comment
	}

	public static void main(String[] args) {
	factNum(7);
	factNum(9);
	//int num;
	//num=7;
	//factNum(num);actual argument
	//System.out.println(num);
	}

}
