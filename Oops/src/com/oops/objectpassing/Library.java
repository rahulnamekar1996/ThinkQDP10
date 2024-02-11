package com.oops.objectpassing;

public class Library {
	private int id;
	private String name;
	private double cost;
	static int count;
	static String supplier;
	
	static 
	{
		supplier="Mr XYZ";
	}
	{
		count++;
	}
	Library()
	{
		
	}
	Library(int id,String name,double cost)
	{
		this.id=id;
		this.name=name;
		this.cost=cost;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getCost()
	{
		return cost;
	}
	public void setCost(double cost) 
	{
		this.cost = cost;
	}
	
	public String toString() 
	{
		return "Book name = "+name+" "+"Book Id = "+id+" "+"Book cost "+cost+" "+"Supplier "+supplier+" "+"count = "+count;
	}
	
	
	
	
	
	

}
