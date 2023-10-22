package com.revision2;
class A1
{
     int data = 40;
     private void display()
     {
    	 System.out.println("Welcome to A1:");
     }
     void show()
     {
    	 System.out.println("New java:");
     }
     protected void msg()
        {
               System.out.println("Hello java");
        }
     public void print()
     {
    	 System.out.println("new version of java:");
     }
}
class B1 extends A1
{
	int data = 50;
	 private void display()
    {
   	 System.out.println("Welcome to B1 class:");
    }
	 public void show()
     {
    	 System.out.println("New java B1 class:");
     }
     public void msg()
       {
              System.out.println("Hello java class B1");
       }
//       void print()
//     {
//    	 System.out.println("new version of java:");
//     }
}
public class AccessSpecifier
{
	public static void main(String[] args)
	{
		A1 a = new A1();
		System.out.println(a.data);
		a.msg();
		B1 b=new B1();
		System.out.println(a.data);
		a.msg();
		
	}

}
