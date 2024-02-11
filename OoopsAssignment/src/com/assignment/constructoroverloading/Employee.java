package com.assignment.constructoroverloading;

public class Employee {
	
	private int eid;
	private String ename,dept;
	private double basicsal,pf,hra,da,netsal;
	
	Employee()
	{
		dept="Quality";
	}
	Employee(int eid, String ename,double basicsal)
	{
		this(); // constructor chainning
		this.eid=eid;
		this.ename=ename;
		this.basicsal=basicsal;
	}
	public void calculateSal() 
	{
		pf=basicsal*0.1;
		hra=basicsal*0.15;
		da=basicsal*0.2;
		netsal=basicsal-(pf+da+hra);
		
	}
	public void displayEmployeeDetails() 
	{
		System.out.println("Employee Id = "+eid);
		System.out.println("Employee name = "+ename);
		System.out.println("Employee Net Sallary = "+netsal);
		System.out.println("Department = "+dept);
	}
	
	

}
