package com.assignment.inheritancemethodovrriding;

public class Devloper {
	
	private String devname;
	private double devExp;
	private String skills;
	
	public Devloper() 
	{
		
	}
	public Devloper(String devname,double devExp,String skills)
	{
		this.devname=devname;
		this.devExp=devExp;
		this.skills=skills;
	}
	public String getDevname()
	{
		return devname;
	}
	public void setDevname(String devname) 
	{
		this.devname = devname;
	}
	public double getDevExp()
	{
		return devExp;
	}
	public void setDevExp(double devExp) 
	{
		this.devExp = devExp;
	}
	public void debugApp() 
	{
		System.out.println("Debug is in use");
	}
	public void integrateCode() 
	{
		System.out.println("Integration Done");
	}
    public String toString() 
    {
    	return skills;
    }
}
