package com.assignment.inheritancemethodovrriding;

public class WebApplication extends Application {
	
	
protected int purchaseid;
	
	public WebApplication() 
	
	{
		
	}
	public WebApplication(double version,String technology,Devloper devloper,int purchaseid) 
	{
		super(version ,technology,devloper);
		this .purchaseid=purchaseid;
	}
	public String toString() 
	{
		return "Web App" +purchaseid+""+super.toString();
	}

}
