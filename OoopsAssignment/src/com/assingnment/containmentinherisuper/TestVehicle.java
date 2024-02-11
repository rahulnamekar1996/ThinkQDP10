package com.assingnment.containmentinherisuper;

class Vehicle
{
protected String colour ;
protected int year ;
protected String model;

public Vehicle ()
{
	
}
public Vehicle(String colour,int year,String model) 
{
	this.colour=colour;
	this.year=year;
	this.model=model;
}
public String toString() 
{
	return colour+" "+year+" "+model;
			
}
	
}
class Car1 extends Vehicle
{
	String bodystyle;
	
	public Car1() 
	{
		
	}
	public Car1(String colour ,int year ,String model,String bodystyle) 
	{
		super (colour,year,model);
		this.bodystyle=bodystyle;
	}
	public String toString() 
	{
		return " car details "+super.toString()+" "+bodystyle;
	}
}

public class TestVehicle {
	
		public static void main(String[] args) 
		
	{
		Car1 c1=new Car1 ("red",2023,"hyundai","best");
		System.out.println(c1.colour+c1.model+c1.year);
		System.out.println(c1.bodystyle);
		System.out.println(c1);
		
//		Vehicle v1= new Vehicle("red ",2024,"hyu");
//		System.out.println(v1);
//		

	}

}
