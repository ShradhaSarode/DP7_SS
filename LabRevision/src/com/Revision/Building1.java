package com.Revision;

 class Building12
{
	String name;
	String lisenceNo;
	String locality;
	Building12()
	{
		
	}
public Building12(String name, String lisenceNo, String locality) {
		super();
		this.name = name;
		this.lisenceNo = lisenceNo;
		this.locality = locality;
	}
@Override
public String toString()
{
	return "Building1 name=" + name+ "\n"
			+ "lisenceNo=" + lisenceNo+ "\n"
			+ "locality=" + locality + "\n";
}
}
class Royal extends Building12
{
	//char wing;
	String owner;
	float price;
	Royal()
	{
		
	}
	 Royal(String name, String lisenceNo, String locality,String owner, float price)
	{
		super(name,lisenceNo,locality);
		this.owner = owner;
		this.price = price;
	}
	@Override
	public String toString()
	{
		return super.toString()
				+"Royal owner=" + owner+"\n"
				+ "price=" + price +"\n";
	}
}
	public class Building1
	{
	public static void main(String[] args)
	{
		Royal r1=new Royal("Sukhwani","SBy4523","Chinchwad","Mr.Sharma",500000f);
		System.out.println(r1);
	}
	}

