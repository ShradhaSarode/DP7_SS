package com.revision;

public class ReverseSumCheck
{
	public static boolean checkReverse(int num)
	{
		int original=num;
		int first3Sum=0;
		int last3Sum=0;
		//sum of last 3 digit
		for(int i=0;i<3;i++)
		{
			last3Sum=last3Sum+(num%10);
					num /=10;
		}
		System.out.println("Last 3 digit:"+last3Sum);
		num=original;
		//reverse the number
		int revNum=0;
		while(num!=0)
		{
			revNum=revNum*10+(num%10);
			num /=10;
		}
		//sum of first 3 digit
				for(int i=0;i<3;i++)
				{
					first3Sum=first3Sum+(revNum%10);
					revNum /=10;	
				}
		System.out.println("First 3 Digit:"+first3Sum);
		if(last3Sum==first3Sum)
		return true;
		else
			return false;
	}

	public static void main(String[] args)
	{
		int num=12321;
		System.out.println("number is:"+num);
		System.out.println(checkReverse(num));

	}

}
