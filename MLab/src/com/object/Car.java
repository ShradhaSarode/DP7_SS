package com.object;

public class Car implements Comparable<Car> {
	private int modelNo;
	private String colour;
	private double price;
	private Engine engine;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int modelNo, String colour, double price, Engine engine) {
		super();
		this.modelNo = modelNo;
		this.colour = colour;
		this.price = price;
		this.engine = engine;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [modelNo=" + modelNo + ", colour=" + colour + ", price=" + price + ", engine=" + engine + "]";
	}

	@Override
	public int compareTo(Car c) {
//		return this.modelNo-c.modelNo;
//		this.getEngine().getEngineType().compareTo(c.getEngine().getEngineType());
		if (this.getEngine().getEngineType().compareTo(c.getEngine().getEngineType()) == 0) {
			if (this.getPrice() < c.getPrice())
				return 1;
			else if (this.getPrice() > c.getPrice())
				return -1;
			else
				return 0;
		} else
			return this.getEngine().getEngineType().compareTo(c.getEngine().getEngineType());

	}
}
