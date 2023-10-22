package com.interfaceDemo;
interface MessageService
{
	
	void sendMsg();
}
class WhatsApp implements MessageService
{
	@Override
	public void sendMsg()
	{
		System.out.println("You are using WhatsApp......");	
	}
}
class Facebook  implements MessageService
{
	@Override
	public void sendMsg()
	{
		System.out.println("You are using Facebook......");	
	}	
}
class Instagram  implements MessageService
{
	@Override
	public void sendMsg()
	{
		System.out.println("You are using Instagram......");	
	}	
}
public class InterfaceMsg {

	public static void main(String[] args)
	{
		MessageService m;
		m=new WhatsApp();
		m.sendMsg();
		m=new Facebook();
		m.sendMsg();
		m= new Instagram();
		m.sendMsg();
	}

}
