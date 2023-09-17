package com.labcontainment;

public class Date
{
	private int dd;
	private int mm;
	private int yy;
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	Date()
	{
		
	}
	 Date(int dd, int mm, int yy)
	 {	
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public String toString()
	{
		return "Date:" + dd+"\n"
				+ "Month:" + mm+"\n"
				+ "Year=" + yy +"\n";
	}
	

}
