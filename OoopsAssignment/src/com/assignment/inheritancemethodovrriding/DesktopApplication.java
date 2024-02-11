package com.assignment.inheritancemethodovrriding;

public class DesktopApplication extends Application
{
	protected int did;
	
	public DesktopApplication() 
	
	{
		
	}
	public DesktopApplication(double version,String technology,Devloper devloper,int did) 
	{
		super(version ,technology,devloper);
		this .did=did;
	}
	public String toString() 
	{
		return "DeskTop App" +did+""+super.toString();
	}
 
}
