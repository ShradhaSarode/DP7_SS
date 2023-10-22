package com.Revision;
/*
 A player class has player id , name, country c. Class country has country id and name. Create
a player object. Assume that all fields in player class and country class are private. Assign
values to player object using getter setter.
 */
public class Player
{
	private int pid;
	private String pName;
	private Country c;
	Player()
	{
		
	}
	 Player(int pid, String pName, Country c)
	 {
		super();
		this.pid = pid;
		this.pName = pName;
		this.c = c;
	}
	 
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Country getC() {
		return c;
	}
	public void setC(Country c) {
		this.c = c;
	}
	public static void main(String[] args)
	{
		Player p1=new Player();
		Country c1=new Country();
		
		p1.setPid(101);
		p1.setpName("MS Dhoni");
		
		p1.setC(c1);
		p1.getC().setCid(111);
		p1.getC().setcName("India");
		
		System.out.println("Player id:"+p1.getPid()+"\n"
				                   +"Name:" +p1.getpName()+"\n"
				                   +"Country id:" +p1.getC().getCid()+"\n"
				                    +"Country Name:"+p1.getC().getcName()+"\n");
	}

}
