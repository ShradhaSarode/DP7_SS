package com.labcontainment;

public class Machine
{
	private String machineType;
	private Engine e;
	Machine()
	{
		
	}
	 Machine(String machineType, Engine e)
	 {
		this.machineType = machineType;
		this.e = e;
	}
	public String getMachineType() {
		return machineType;
	}
	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public String toString() {
		return "Machine Type:" + machineType+"\n"
				+ "e:" + e + "\n";
	}
	
}
