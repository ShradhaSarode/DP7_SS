package com.treeMap;

public class Order
{
	private int orderid;
	private String pname;
	private int price;
	public Order() {
		super();
		
	}
	public Order(int orderid, String pname, int price) {
		super();
		this.orderid = orderid;
		this.pname = pname;
		this.price = price;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", pname=" + pname + ", price=" + price + "]";
	}
}
