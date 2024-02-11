package com.demo.inheritance;


	class Parent1
	{
		int value;
		String msg;
		
		Parent1()
		{
			msg="Welcome";
		}
		Parent1(int value)
		{
			this();
			System.out.println("In parent class para constructor.. ");
			this.value=value;
			
		}
		
		void display()
		{
			System.out.println("Value:"+value);
		}


	}

	class Child1 extends Parent1
	{
		int data;
		String msg;
		
		Child1()
		{
			msg="Hello";
		}
		
		Child1(int value, int data)
		{
			// this();
		  super(value);
		 
		  System.out.println("In child class para const");
		  this.data=data;
		  msg="Hello";
		  
		}
		
		void display()
		{
			super.display();
			System.out.println("Data:"+data);
		}
		
		void show()
		{
			String msg="Java";
			System.out.println("Message:"+msg);
			System.out.println("Inst message:"+this.msg);
			System.out.println("Super message:"+super.msg);
		}
		

	}

	public class SuperDemo1 {
	
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c= new Child1(10,100);
//		System.out.println("Data:"+c.data);
//		System.out.println("Value:"+c.value);
		c.display();
		c.show();
	      
	}

}
