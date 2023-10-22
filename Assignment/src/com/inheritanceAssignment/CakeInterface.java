package com.inheritanceAssignment;
/*
 Create interface Cake with a method declared as bake. Create 2 classes 
Strawberry, BlackForest both implementing Cake interface.
 */
interface Cake
{
	void bake();
}
class Strawberry implements Cake
{
	@Override
	public void bake()
	{
		System.out.println("Baking a delicious Strawberry cake.");
	}	
}
class BlackForest implements Cake
{
	@Override
	public void bake()
	{
		System.out.println("Baking a rich Black Forest cake.");
	}
}
public class CakeInterface
{
	public static void main(String[] args)
	{
		Cake strawberryCake = new Strawberry();
        Cake blackForestCake = new BlackForest();
        strawberryCake.bake(); 
        System.out.println("-------------------------------------------------------------");
        blackForestCake.bake();
        System.out.println("--------Using Dynamic Method Dispatch-------------------");
        Cake s1;
        s1=new Strawberry();
        s1.bake();
        System.out.println("-------------------------------------------------------------");
        s1=new BlackForest();
        s1.bake();
	}
}
