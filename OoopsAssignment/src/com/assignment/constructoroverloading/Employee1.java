package com.assignment.constructoroverloading;

public class Employee1 {

	private int eid;
	private String ename,dept;
	private double basicsal,pf,hra,da,netsal;
	Employee1()
	{
	   eid=eid;
	   ename=ename;
	   dept=dept;
	   basicsal=basicsal;
	  
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getBasicsal() {
		return basicsal;
	}
	public void setBasicsal(double basicsal) {
		this.basicsal = basicsal;
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
	public void compareSal(Employee1 obj) 
	{
		if(obj.netsal>this.netsal) 
		{
			System.out.println(obj.ename+" is higher sallary than "+this.ename);
		}
		else
		{
			System.out.println(this.ename+" is higher sallary than "+obj.ename);
			 
		}
	}

}
