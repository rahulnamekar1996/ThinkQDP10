package com.demo.methhodoverloading;

public class Shape {
	
	public static void area(int side ) 
	{
		System.out.println("Area of square = "+(side*side));	
		
	}
	public static void area(int length ,int breadth)
	{
		System.out.println("Area of rectangle = "+(length *breadth));
	}
	public static void area(float radius) 
	{
		System.out.println("Area of circle = "+(3.14*radius*radius));
	}

}
