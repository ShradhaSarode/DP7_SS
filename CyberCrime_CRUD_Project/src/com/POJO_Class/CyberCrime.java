package com.POJO_Class;

public class CyberCrime
{
	//section  43 =hacking and data theft 
	//section 66E=violation of privacy
	//43H,66=Hacking
	//Sending threatening message	Section 503
	//Transmitting Virus
	
	private int section;
	private String crime;
	private String accused_name;
	private int peneltyAmount;
	//private double punishment;
	public int getSection()
	{
		return section;
	}
	public void setSection(int section)
	{
		this.section = section;
	}
	public String getCrime()
	{
		return crime;
	}
	public void setCrime(String crime)
	{
		this.crime = crime;
	}
	public String getAccused_name()
	{
		return accused_name;
	}
	public void setAccuse_name(String accused_name)
	{
		this.accused_name = accused_name;
	}
	public int getPeneltyAmount()
	{
		return peneltyAmount;
	}
	public void setPeneltyAmount(int peneltyAmount)
	{
		this.peneltyAmount = peneltyAmount;
	}
	public CyberCrime()
	{
		super();
	}
	public CyberCrime(int section, String crime, String accuse_name, int peneltyAmount)
	{
		super();
		this.section = section;
		this.crime = crime;
		this.accused_name = accuse_name;
		this.peneltyAmount = peneltyAmount;
	}
	@Override
	public String toString()
	{
		return "CyberCrime [section=" + section + "\ncrime=" + crime + "\naccuse_name=" + accused_name
				+ "\npeneltyAmount=" + peneltyAmount + "]";
	}
}
