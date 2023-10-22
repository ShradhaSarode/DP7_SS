package com.Coupling;

interface MessageS
{
	void sentMessage(String msg);
}
class WhatsApp implements MessageS
{
	String type;

	@Override
	public void sentMessage(String msg)
	{
		this.type="WhatsApp";
		System.out.println(type+": "+msg);
	}
}
class Instagram implements MessageS
{
	String type;

	@Override
	public void sentMessage(String msg)
	{
		this.type="Instagram";
		System.out.println(type+": "+msg);
	}
}
public class LooseCoupling
{
	public void msgsType(MessageS m1)
	{
		m1.sentMessage("Hello");
	}
	public static void main(String[] args)
	{
		LooseCoupling l1= new LooseCoupling();
		Instagram i1=new Instagram();
		l1.msgsType(i1);
		WhatsApp w1=new WhatsApp();
		l1.msgsType(w1);
		
	}

}
