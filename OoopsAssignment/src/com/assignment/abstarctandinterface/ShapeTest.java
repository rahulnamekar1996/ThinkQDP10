package com.assignment.abstarctandinterface;

abstract class Shape
{
	abstract void calaculateArea();
	abstract void calculatePerimetre();
	
}
class Circle extends Shape
{
   private double radius;
   
   public Circle() 
   {
	   
	   
   }
	public Circle(double radius) 
	{
		this.radius=radius;
	}


public void setRadius(double radius) {
	this.radius = radius;
}

	@Override
	void calaculateArea() 
	{
      System.out.println("Area of cicle = "+3.14*radius*radius );
		
	}

	@Override
	void calculatePerimetre() 
	{
		System.out.println("Perimetre of circle = "+2*3.14*radius);
		
	}
	
}
class Tringle extends Shape
{
   private double s1;
   private double s2;
   private double s3;
   
   public Tringle() 
   {
	   
   }
   public Tringle(double s1,double s2,double s3) 
   {
	   this.s1=s1;
	   this.s2=s2;
	   this.s3=s3;
	   
   }
	
	@Override
	void calaculateArea() 
	
	{
		double s=(s1+s2+s3)/2;
      System.out.println("Area of Tringle = "+(Math.sqrt(s*(s-s1)*(s-s2)*(s-s3))) );
		
	}

	@Override
	void calculatePerimetre() 
	{
		System.out.println("Perimetre of Tringle = "+(s1+s2+s3));
		
	}

	
	
}

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s;
		s=new Circle(15);
		s.calaculateArea();
		s.calculatePerimetre();
		
		s=new Tringle(10,10,10);
		s.calaculateArea();
		s.calculatePerimetre();
	}

}
