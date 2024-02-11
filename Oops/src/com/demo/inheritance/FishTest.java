package com.demo.inheritance;

class Fish
{
	protected String name;
	protected int gills;
	
	public Fish() 
	{
		
	}
	public Fish(String name,int gills) 
	{
		this.name=name;
		this.gills=gills;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGills() {
		return gills;
	}
	public void setGills(int gills) {
		this.gills = gills;
	}
	public void  swim() 
	{
		
	}

}

class GoldFish extends Fish
{
	public GoldFish() 
	{
		super();
		
	}
	public GoldFish(String name,int gills) 
	{
		super(name ,gills);
	}
	
	public void swim() 
	{
		System.out.println("it swimms in 150km /hr");
	}
	public String toString() 
	{
		return "Name= "+name+"Gilss"+gills;
	}

}
class Wales extends Fish
{
	public Wales() 
	{
		super();
		
	}
	public Wales(String name,int gills) 
	{
		super(name ,gills);
	}
	
	public void swim() 
	{
		System.out.println("it swimms in 90 km /hr");
	}

}


public class FishTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fish f;
		f=new GoldFish("xyz ",6);
		f.swim();
		
		f=new Wales("tsp",4);
        f.swim();
	}

}
