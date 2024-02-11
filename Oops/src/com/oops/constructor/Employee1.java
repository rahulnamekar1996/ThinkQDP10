package com.oops.constructor;

 class Employee1 {
	private int eid;
	private String ename;
	private double esal;
	
	Employee1()
	{
		System.out.println("default constructor");
		
	}
	Employee1(int eid,String ename,double esal)
	{
		System.out.println("para constructor..1");
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	Employee1(int eid,String ename)
	{
		System.out.println("para constructor..2");
		this.eid=eid;
		this.ename=ename;
		esal=0.00;
		
	}
	public void setEsal(int esal)
	{
		this.esal=esal;
	}
	public int getEsal(int esal)
	{
		return esal;
	}
	public String toString() 
	{
		return "eid ="+eid + " "+"ename = "+ename+" "+" esal = "+esal;
	}

}
