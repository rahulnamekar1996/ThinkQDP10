package com.oops.getset;

public class Empolyee {
	
	int eid;
	String ename;
	double esal;
	
	public void setDetails(int eid ,String ename,double esal)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		
	}
	
	public void setEid(int eid) 
	{
		this.eid=eid;
	}
	public int getEid() 
	{
		return eid;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEsal(double esal) 
	{
		this.esal=esal;
		
	}
	public double getEsal() 
	{
		return esal;
	}
	public void showDetails()
	{
		System.out.println("Emplyee id = "+eid);
		System.out.println("Employee name = "+ename);
		System.out.println("Employee sallary = "+esal);
		
	}
	

}
