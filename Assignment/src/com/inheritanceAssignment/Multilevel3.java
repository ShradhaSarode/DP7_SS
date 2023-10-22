package com.inheritanceAssignment;

import java.util.Date;

class Location
{
	private String city;
    private String country;
	Location()
	{
		
	}
	Location(String city, String country)
	{
		this.city=city;
		this.country=country;
	}
	@Override
	public String toString()
	{
		return "Location [city=" + city + ", country=" + country + "]";
	}
	
}
class WeatherData extends Location
{
	private Date date;
    private double temperature;
	WeatherData()
	{
		
	}
	public WeatherData(String city, String country,Date date,double temperature)
	{
		super(city, country);
		this.date=date;
		this.temperature=temperature;
	}
	public Date getDate()
	{
		return date;
	}
	public void setDate(Date date)
	{
		this.date = date;
	}
	@Override
	public String toString()
	{
		return super.toString()+"\n"
				+"WeatherData [date=" + date + ", temperature=" + temperature + "]";
	}
}
class Forecast extends WeatherData
{
	private double dailyForecast;
	Forecast()
	{
		
	}
	public Forecast(String city, String country, Date date, double temperature,double dailyForecast)
	{
		super(city, country, date, temperature);
		this.dailyForecast=dailyForecast;
	}
	@Override
	public String toString()
	{
		return super.toString()+"\n"
				+"Forecast [dailyForecast=" + dailyForecast + "]";
	}
	
}
public class Multilevel3
{
	public static void main(String[] args)
	{
		Forecast f1=new Forecast("Nanded","India",null, 39.2,5.2);
		f1.setDate(null);
		System.out.println(f1);
	}

}
