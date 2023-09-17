package com.labcontainment;

public class Engine
{
	private String engineType;
	private int price;
	Engine()
	{
		
	}
	 Engine(String engineType, int price) 
	{
		this.engineType = engineType;
		this.price = price;
	}
	 
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString()
	{
		return "Engine Type:" + engineType+"\n"
				+ "price:" + price +"\n";
	}
	public static void main(String[] args)
	{
		Engine e1=new Engine();
//		e1.setEngineType("new");
//		e1.setPrice(100000);
		
		Car1 c1=new Car1();
		c1.setModelNo(101);
		c1.setCarName("creta");
		
		 Machine m1=new  Machine();
		 c1.setM(m1);
		 c1.getM().setMachineType("old");
		
		 c1.getM().setE(e1);
		c1.getM().getE().setEngineType("new");
		 c1.getM().getE().setPrice(150000);
		 
		 System.out.println("Car Name:"+c1.getCarName()+"\n"
				 +"model num:"+c1.getModelNo()+"\n"
				 +"machine type:"+c1.getM().getMachineType()+"\n"
				 +"engine type:"+c1.getM().getE().getEngineType()+"\n"
				 +"engine price:"+c1.getM().getE().getPrice()+"\n");
		
		//System.out.println(c1);
	}

}
