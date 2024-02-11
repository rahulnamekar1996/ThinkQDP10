package com.demo.inheritance;
class Parent
{
	int value;
	String msg;
	
	Parent()
	{
		msg="Welcome";
	}
	Parent(int value)
	{
		this();
		System.out.println("In parent class para constructor.. ");
		this.value=value;
	}
	void display() 
	{
		
	}
	


}

class Child extends Parent
{
	int data;
	String msg;
	Child()
	{
		msg= "Hello";
	}
	
	Child(int value, int data)
	{
		//this();
	  super(value);
	  System.out.println("In child class para const");
	  this.data=data;
	  msg="hello";
	  
	}
	void diplay() 
	{
		super.display();
	}
	

}






public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c= new Child(10,100);
		System.out.println("Data:"+c.data);
		System.out.println("Value:"+c.value);

	}

}
