package com.stack;
class MyStack
{
	int top;
	int size;
	int stk[];
	public MyStack()
	{
		
	}
	public MyStack(int size)
	{
		top=-1;
		this.size=size;
		stk=new int[this.size];
	}
	boolean push(int data)
	{
		if(top<size-1)
		{
			top++;
			stk[top]=data;
			return true;
		}
		else
		{
			System.out.println("stack is full");
			return false;
		}
	}
	void pop()
	{
		if(top!=-1)
		{
			System.out.println("element deleted: "+stk[top]);
			top--;
		}
		else
		{
			System.out.println("stack is empty");
		}
	}
	void display()
	{
		if(top!=-1)
		{
			System.out.println();
			System.out.print("[");
			for(int i=0;i<stk.length;i++)
			{
				System.out.print(stk[i]+",");
			}
			System.out.print("]");
			System.out.println();
		}
		else
		{
			System.out.println("stack is empty");
		}
	}
}
public class StackArray
{

	public static void main(String[] args)
	{
		MyStack s1= new MyStack(5);
		s1.pop();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.display();
		
		s1.push(60);
		
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		
		
	}

}
