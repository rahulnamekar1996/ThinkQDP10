package com.oops.objectclass;

public class Rectangle {
	
	int length;
	int breadth;
	
	 public void setValues(int length,int breadth) 
	 {
		 this.length=length;
		 this.breadth=breadth;
	 }
	 public  double showArea()
	 {
		
		 
		 double area=length*breadth;
	      return area;
	 }
	 public  double showPerimetre()
	 {
		
		 double perimetre=2* (length+breadth);
		return perimetre;
		 
	 }
	 public  void displayResult()
	 {
		 System.out.println("Length"+length);
		 System.out.println("breadth"+breadth);
		 System.out.println("Area ="+ showArea() );
		 System.out.println("pERIMETRE ="+showPerimetre());
	 }
	 
	 
	 

}
