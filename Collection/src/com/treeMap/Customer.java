package com.treeMap;

public class Customer
{
	private int id;
	private String cname;
	private long mno;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String cname, long mno) {
		super();
		this.id = id;
		this.cname = cname;
		this.mno = mno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getMno() {
		return mno;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", cname=" + cname + ", mno=" + mno + "]";
	}
}
