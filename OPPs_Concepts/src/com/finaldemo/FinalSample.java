package com.finaldemo;
class Building
{
	private static String name;
	protected String locality;
	final String lisenceNo="HBY9598R";
	static
	{
		name="Sukhwani Udyan Society";
	}
	Building()
	{
		//this.lisenceNo="HBY9598R";
	}
	public Building(String name, String locality)
	{
		super();
		Building.name = name;
		this.locality = locality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getLisenceNo() {
		return lisenceNo;
	}
	@Override
	public String toString() {
		return "Building name=" + name+"\n"
				+ "locality=" + locality+"\n"
				+ "lisenceNo=" + lisenceNo +"\n";
	}
	
}
class Flat extends Building
{
	private int flatNo;
	protected static float price;
	private String bhk;
	static
	{
		price=56000000;
	}
	Flat()
	{
		
	}
	public Flat(int flatNo, float price, String bhk) {
		super();
		this.flatNo = flatNo;
		this.price = price;
		this.bhk = bhk;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBhk() {
		return bhk;
	}
	public void setBhk(String bhk) {
		this.bhk = bhk;
	}
	@Override
	public String toString() {
		return "Flat No=" + flatNo+"\n"
				+ "price=" + price+"\n"
				+ "bhk=" + bhk +"\n";
	}
	
}
public class FinalSample {

	public static void main(String[] args) {
		

	}

}
