package com.object;
public class Engine
{
	private int engineno;
	private String engineType;
	public Engine() {
		super();
		
	}
	public Engine(int engineno, String engineType) {
		super();
		this.engineno = engineno;
		this.engineType = engineType;
	}
	public int getEngineno() {
		return engineno;
	}
	public void setEngineno(int engineno) {
		this.engineno = engineno;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	@Override
	public String toString() {
		return "Engine [engineno=" + engineno + ", engineType=" + engineType + "]";
	}
}

