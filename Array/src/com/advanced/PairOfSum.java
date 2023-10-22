package com.advanced;

public class PairOfSum
{
	static void finfPair(int ar[],int s)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>s)
				continue;
			for(int j=i+1;j<ar.length;j++)
			{
				if((ar[i])+(ar[j])==s)
				{
					System.out.println("Pair:"+"("+ar[i]+","+ar[j]+")");
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int arr[]= {8,2,3,4,6,9,1,5};
		int sum=7;
		finfPair(arr,sum);
	}

}
