package com.Revision;

public class Country
{
	private int cid;
	private String cName;
	Country()
	{
		
	}
    Country(int cid, String cName)
    {
		super();
		this.cid = cid;
		this.cName = cName;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	
}
