package com.oops.constructor;

public class Employee {
	
	int eid;
	String ename;
	double esal;
	
	public Employee()
	{
		System.out.println("Constructor is invoked");
		
	}
	public Employee(int eid) 
	{
		System.out.println("Parametrized constructor is invoked = "+eid);
		
	}
	public void show() 
	{
		System.out.println("method");
	}

}
