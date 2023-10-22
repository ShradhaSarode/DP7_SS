package com.exceptionthrow;

import java.io.IOException;

public class CheckedException
{
	public static void main(String[] args)throws IOException, ArithmeticException
	{
		throw new ArithmeticException("divide by zero");
//		throw new IOException("input error");
	}

}
