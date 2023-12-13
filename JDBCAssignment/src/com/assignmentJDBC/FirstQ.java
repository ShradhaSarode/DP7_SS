package com.assignmentJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

//1.	WAP using JDBC to select and print all country names.
public class FirstQ
{
	static Connection con ;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	public FirstQ()
	{
		con = DBConnect.getConnect();
		System.out.println("Connection done.....");
		try {
			pst = con.prepareStatement("select COUNTRY_NAME from countries");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	public void fetchCountryDetails() {
		try {
			rs = pst.executeQuery();

			System.out.println("--------------Countries---------------------");
			while (rs.next()) {
				System.out.println("COUNTRY_NAME: "+ rs.getString(1) );
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	public static void main(String[] args) 
	{
		FirstQ f1=new FirstQ();
		f1.fetchCountryDetails();
	}

}
