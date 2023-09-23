package com.contenment;
class Cake
{
	int price;
	String flavour;
	static int count=0;
	Cake()
	{
		price=600;
		count++;
	}
	public Cake(int price, String flavour)
	{
		this.price = price;
		this.flavour = flavour;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Cake.count = count;
	}
	@Override
	public String toString() {
		return "Cake price=" + price +"\n"
				     + "flavour=" + flavour +"\n";
	}
	
}
public class CakeTracker
{
	public static void main(String[] args)
	{
		Cake c1= new Cake();
		System.out.println(Cake.count);
	}

}
