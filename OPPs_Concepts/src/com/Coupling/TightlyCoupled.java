package com.Coupling;
interface Message
{
	void sentMessage(String msg);
	
}
class Facebook implements Message
{
	String type;

	@Override
	public void sentMessage(String msg) {
		this.type="Facebook";
		System.out.println(type+": "+msg);
	}
}
class Telegram implements Message
{
	String type;

	@Override
	public void sentMessage(String msg) {
		this.type="Telegram";
		System.out.println(type+": "+msg);
	}
}
public class TightlyCoupled 
{
	public void msgType(Facebook fb)
	{
		fb.sentMessage("Hey");
	}
	public static void main(String[] args)
	{
		TightlyCoupled  tc=new TightlyCoupled ();
		Facebook f1=new Facebook();
		tc.msgType(f1);
		Telegram t1=new Telegram();
		//tc.msgType(t1);
	}

}
