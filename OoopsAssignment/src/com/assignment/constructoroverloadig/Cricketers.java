package com.assignment.constructoroverloadig;

public class Cricketers {
	
	private int playerid;
	private String name;
	private boolean isBaller;
	private float strikerate;
	private int runs;
	public Cricketers() 
	{
		
	}
	
	public Cricketers(int playerid,String name, boolean isBaller,float strikerate,int runs )
	{
		this.playerid=playerid;
		this.name=name;
		this.isBaller=isBaller;
		this.strikerate=strikerate;
		this .runs=runs;
	}
	public Cricketers(float strikerate,boolean isBaller) 
	
	{
		this.isBaller=isBaller;
		this.strikerate=strikerate;
		
	}

	
	public void setPlayerid(int playerid) 
	{
		this.playerid=playerid;
		
	}
	public int getPlayerid() 
	{
		return playerid;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setIsballer(boolean isBaller)
	{
		this.isBaller=isBaller;
	}
	public boolean getIdballer() 
	{
		return isBaller;
	}
	public void setStrikerate(float strikerate) 
	{
		this .strikerate=strikerate;
	}
	public float getStrikerate() 
	{
		return strikerate;
	}
	public void setRuns(int runs) 
	{
		this .strikerate=strikerate;
	}
	public float getRuns() 
	{
		return runs;
	}
	
	public void showDetails() 
	{
		System.out.println("Player Id = "+playerid);
		System.out.println("Player Name = "+name);
		System.out.println("PLAYER IS BALLER = "+isBaller);
		System.out.println("Strike Rate of Player = "+strikerate);
		System.out.println("Runs of player = "+runs);
	}

	

}
