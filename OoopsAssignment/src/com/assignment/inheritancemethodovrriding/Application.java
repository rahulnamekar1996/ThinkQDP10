package com.assignment.inheritancemethodovrriding;

public class Application {
	
	protected double version;
	protected String technology;
	private Devloper devloper;
	
	public Application() 
	{
		
	}
	public Application(double version,String technology,Devloper devloper) 
	{
		this.version=version;
		this.technology=technology;
		this.devloper=devloper;
	}
	public double getVersion() 
	{
		return version;
	}
	public void setVersion(double version)
	{
		this.version = version;
	}
	public String getTechnology() 
	{
		return technology;
	}
	public void setTechnology(String technology) 
	{
		this.technology = technology;
	}
	public Devloper getDevloper() 
	{
		return devloper;
	}
	public void setDevloper(Devloper devloper) 
	{
		this.devloper = devloper;
	}
    public void install() 
    {
    	System.out.println("Installation done !");
    }
    public void uninstall() 
    {
    	System.out.println("Un Installation done!");
    }
    public String toString() 
    {
    	return "Application"+version+" "+technology+" "+devloper;
    }
}
