package com.oops.objectclass;

public class PrintTest {
	
	
	  public void printMessage( String name)
	  {
		  System.out.println("Hello Good morning "+ name);
	  }

	public static void main(String[] args) {
	

		PrintTest p1=new PrintTest();
		p1.printMessage("Rahul");
	}

}
