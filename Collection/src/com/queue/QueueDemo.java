package com.queue;
class MyQueue
{
	int front ,rear;
	int size;
	int []arr;
	
	public MyQueue() {
		super();
		
	}

	public MyQueue( int size) {
		super();
		this.front = 0;
		this.rear = 0;
		this.size = size;
		arr = new int[this.size];
	}
	public void insert(int data)
	{
		if(rear<size)
		{
			arr[rear]=data;
			rear++;
			System.out.println("inserted...");
		}
		else
		{
			System.out.println("queue is full");
		}
	}
	public void delete()
	{
		int temp;
		if(rear>front)
		{
			System.out.println("deleted: "+arr[front]);
			for(temp=front;temp<rear-1;temp++)
			{
				arr[temp]=arr[temp+1];
			}
			arr[--rear]=0;
		}
		else
		{
			System.out.println("queue is empty");
		}
	}
	void display()
	{
		if(rear>front)
		{
			for(int i=front;i<rear;i++)
			{
				System.out.println(arr[i]);
			}
		}
		else
		{
			System.out.println("queue is empty");
		}
	}
}
public class QueueDemo {

	public static void main(String[] args)
	{
		MyQueue q=new MyQueue(5);
		q.delete();
		q.insert(56);
		q.insert(96);
		q.insert(85);
		q.insert(23);
		q.insert(45);
		q.display();
		q.insert(20);
		q.delete();
		
	}

}
