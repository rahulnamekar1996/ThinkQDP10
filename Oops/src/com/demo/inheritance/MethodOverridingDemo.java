package com.demo.inheritance;
class Person
{
   protected String name;	
	
   void display(String name)
  {
	  System.out.println("I am a person:"+name);
  }
   
   static void show()
   {
	   System.out.println("I am Indian");
   }


}

class Employee1 extends Person
{
	@Override
 protected void display(String name)
    {
		show();
    	System.out.println("I am an employee:"+name);
    	System.out.println("Organization:HCL");
    }
	

	static void show()
	{	    
		System.out.println("I am Indian employee");
	}

}

class Trainee extends Person
{
	@Override
    void display(String name)
    {
		super.display(name);
    	System.out.println("I am an trainee:"+name);
    	System.out.println("Probation period:3 months");
    }

}



public class MethodOverridingDemo {

	public static void main(String[] args) {
		Person p= new Person();
		p.display("Amit");
		
		System.out.println("----------------------");
		Employee1 e= new Employee1();
		e.display("Pradnya");
		
		//e.show();
		
		
		Trainee t= new Trainee();
		t.display("Ashish");
		

	}

}
