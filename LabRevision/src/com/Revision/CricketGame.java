package com.Revision;
/*
Create a java class for Cricketer. Class has int playerid, String name , Boolean isBaller ,
float strikerate , int runs. Make these variables private and include appropriate getter and setter
 */
class Cricketer
{
	private int playerid;
	private String name ;
	private Boolean isBaller ;
	private float strikerate ;
	private int runs;
	Cricketer()
	{
		
	}
	public Cricketer(int playerid, String name, Boolean isBaller, float strikerate, int runs)
	{
		//super();
		this.playerid = playerid;
		this.name = name;
		this.isBaller = isBaller;
		this.strikerate = strikerate;
		this.runs = runs;
	}
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsBaller() {
		return isBaller;
	}
	public void setIsBaller(Boolean isBaller) {
		this.isBaller = isBaller;
	}
	public float getStrikerate() {
		return strikerate;
	}
	public void setStrikerate(float strikerate) {
		this.strikerate = strikerate;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
//	@Override
//	public String toString() {
//		return "Cricketer playerid=" + playerid+"\n"
//				+ "name=" + name+"\n"
//				+ "isBaller=" + isBaller +"\n"
//				+ "strikerate="+ strikerate+"\n"
//				+ "runs=" + runs +"\n";
//	}
//	
}
public class CricketGame
{
	public static void main(String[] args)
	{
		Cricketer c1= new Cricketer();
		//System.out.println(c1);
		c1.setPlayerid(101);
		c1.setName("MSD");
		c1.setIsBaller(true);
		c1.setStrikerate(12.5f);
		c1.setRuns(110);
		
		System.out.println("Cricketer id:"+c1.getPlayerid()+"\n"
				                    +  "Name:" +c1.getName()+"\n"
				                    +"IsBaller:" +  c1.getIsBaller()+"\n"
				                   +"strikerate:"  +  c1.getStrikerate()+"\n"
				                   + "runs:" +  c1.getRuns()+"\n");
	}

}
