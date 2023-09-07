package com.lab1;

class Film {
	int id;
	String name;
	double rating;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getRating()
	{
		return rating;
	}
	public void setRating(double rating)
	{
		this.rating = rating;
	}
	Film(int id, String name, double rating)
	{
		this.id=id;
		this.name=name;
		this.rating=rating;

	}
	public String toString()
	{
		return "Id is:" + id+"\n"+
				"name:" + name +"\n"+
				"rating:" + rating +"\n";
				
	}
}

public class Movie
{
	static void ckeckRating(Film m)
	{
		if(m.getRating()>6.0)
		{
			System.out.println(m.getId()+"  "+m.getName()+"  "+m.getRating());
		}
	}

	public static void main(String[] args)
	{
		Film f1=new Film(111,"RRR",8.2);
		Film f2=new Film(121,"OMG",6.2);
		Film f3=new Film(131,"Bahubali",8.5);
		Film f4=new Film(141,"Adipurush",6.0);
		Film f5=new Film(151,"Blind",5.2);
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		
		System.out.println("--------------After--------------");
		ckeckRating(f1);
		ckeckRating(f2);
		ckeckRating(f3);
		ckeckRating(f4);
		ckeckRating(f5);
	}

}
