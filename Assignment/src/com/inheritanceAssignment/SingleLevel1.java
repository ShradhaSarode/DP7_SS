package com.inheritanceAssignment;
class A
{
    int a;
    void set_A(int x)
    {
      a = x;
    }
}
class B extends A
{
    int b, product;
    void set_B(int x)
    {
      b = x;
    }
    void cal_Product()
    {
        product = a * b;
        System.out.println("Product = " + product);
    }
}
public class SingleLevel1
{
	public static void main(String[] args)
	{
        B b = new B();
        b.set_A(5);
        b.set_B(5);
        b.cal_Product();
    }

}
