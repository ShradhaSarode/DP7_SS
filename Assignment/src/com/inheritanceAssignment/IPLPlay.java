package com.inheritanceAssignment;
/*
5. Create class IPLTeam with method play. Create child classes of IPLTeam 
called as CSK, RCB. In main, call play from child class objects.
 */
class IPL
{
	void play()
	{
		System.out.println("IPL Team:1)CSK 2)RCB");
	}
}
class CSK extends IPL
{
	String cName;
	int player;
	CSK()
	{
		
	}
	public CSK(String cName, int player)
	{
		super();
		this.cName = cName;
		this.player = player;
	}

	void play()
	{
		super.play();
		System.out.println("-----------------------------------------------------------");
		System.out.println("CSK Captain name:"+cName+"\n Number of player:"+player);
	}
}
class RCB extends IPL
{
	String cName;
	int player;
	RCB()
	{
		
	}
	public RCB(String cName, int player)
	{
		super();
		this.cName = cName;
		this.player = player;
	}
	void play()
	{
		//super.play();
		System.out.println("RCB Captain name:"+cName+"\n Number of player:"+player);
	}
}
public class IPLPlay
{
	public static void main(String[] args)
	{
		CSK c1=new CSK("MS Dhoni",11);
		c1.play();
		System.out.println("--------------------------------------------------");
		RCB r1=new RCB("Faf du Plessis",11);
		r1.play();
	}

}
