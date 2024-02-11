package com.oops.getset;

public class Student {
	
	int sid;
	String sname;
	int smarks;
	public void setDetails(int sid,String sname ,int smarks) 
	{
		this .sid=sid;
		this.sname=sname;
		this.smarks=smarks;
	}
	public void setSid(int sid) 
	{
		this.sid=sid;
		
	}
	public int getSid() 
	{
		return sid;
	}
	public void setSname(String sname) 
	
	{
		this.sname=sname;
	}
	public String getSname() 
	{
		return sname;
	}
	public void setSmarks( int smarks)
	{
		this. smarks=smarks;
	}
	public int getSmarks() 
	{
		return smarks;
	}
	public void showDetails() 
	{
		System.out.println("Student Id = "+sid);
		System.out.println("Student name = "+sname);
		System.out.println("Student marks =" +smarks);
	}
	
}
