package com.assignment.constructor;

public class Employee {
	
	private int empid;
	private String ename;
	private double esal;
	
	public void setEmpid( int empid) 
	{
		this.empid=empid;
	}
	public int getEmpid() 
	{
		return empid;
	}
	public void setEname( String ename) 
	{
		this.ename=ename;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEsal( double esal) 
	{
		this.esal=esal;
	}
	public double getEsal() 
	{
		return esal;
	}
	public void showDetails()
	{
		System.out.println("Employee id = "+empid);
		System.out.println("Employye name "+ename);
		System.out.println(" Employee sallary = "+esal);
	}



}
