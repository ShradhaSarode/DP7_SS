package com.covariant;
class Test
{
	 Number value;
	   
	   Number displayValue()
	   {
		   return value;
	   }
}
class Child extends Test
{
	 Integer myVal;    
	    Integer displayValue()
	    {
	    	myVal=20;
	    	return myVal;
	    }
}
//Character is not sub class of Number
//hence not allowed
//class Child extends Test
//{	
//  Character ch;  
//  Character displayValue()
//  {
//  	ch='A';
//  	return ch;
//  }
//}
public class CovariantWrapperDemo2
{

	public static void main(String[] args)
	{
		Test t=new Test();
		t.value=89;
		System.out.println("Value is:"+t.displayValue());
		
		Child s2=new Child();
		System.out.println("Value is:"+(s2.displayValue()+20));

	}

}
