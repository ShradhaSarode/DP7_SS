package com.exceptionAssignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//WAP to show checked exception and use multiple catch block with universal Exception handler.

public class Fourth {
	public static void main(String[] args)
	{
		String dateString = "2023-11-30"; // Invalid date format
		try
		{
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			Date parsedDate = dateFormat.parse(dateString);
			System.out.println("Parsed Date: " + parsedDate);
		} 
		catch (ParseException e)
		{
			System.out.println("Caught ParseException: " + e.getMessage());
		} 
		catch (NumberFormatException e)
		{
			System.out.println("Caught NumberFormatException: " + e.getMessage());
		} catch (Exception e) 
		{
			System.out.println("Caught Exception: " + e.getMessage());
		}
		System.out.println("Program continues running...");
	}
}
