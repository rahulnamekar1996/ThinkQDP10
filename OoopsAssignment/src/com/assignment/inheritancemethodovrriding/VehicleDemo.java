package com.assignment.inheritancemethodovrriding;

 class Vehicle 
{
	protected String colour;
	protected int wheel;
	public Vehicle()
	{
		
	}
	public Vehicle(String colour,int wheel)
	{
		this.colour =colour;
		this.wheel=wheel;
	}
	public String toString() 
	{
		return "Vehicle = "+colour+" "+wheel;
	}
}
class Car extends Vehicle
{
	protected int capacity;
	public Car() 
	{
		
	}
	public Car(String colour,int wheel,int capacity) 
	{
		super(colour,wheel);
		this.capacity=capacity;
		
	}
	public String toString() 
	{
		return "Car"+super.toString()+" "+capacity;
	}
	
}
class Suv extends Car
{
	protected int power;
	
	public Suv() 
	{
		
	}
    public Suv(String colour ,int wheel,int capacity,int power) 
    {
    	super(colour,wheel,capacity);
    	this.power=power;
    }
    public String toString() 
    {
    	return "SUV"+super.toString()+" "+power;
    }
}

public class VehicleDemo {

	public static void main(String[] args) {
		Suv s=new Suv ("red",5,8,500);
		System.out.println(s);

	}

}
