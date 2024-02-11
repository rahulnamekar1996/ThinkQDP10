package com.oops.constructor;

class Demo 
{
	int a,b;
	String name;
	
	Demo()
	
	{
		// this(10,20);// recursive chainnig show error
//		a=10;
//		b=20;
//		name="Unknown";
		System.out.println("Default constructor");
	}
	Demo(int a,int b)
	
	{
		this ();  // constructor chainnig startint at frst line
		this.a=a;
		this.b=b;
		this.name="Unknown";
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.name);
	}
	Demo (int a,int b,String name)
	{
		this.a=a;
		this.b=b;
		this.name=name;
	}
	
}

public class DemoConstructorChainning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Demo d= new Demo(10,20);
	}

}
