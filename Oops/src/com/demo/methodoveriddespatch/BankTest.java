package com.demo.methodoveriddespatch;

class Bank 
{
	protected double rate;
	 
	public void rateOfInterest() 
	{
		rate=8;
		System.out.println("Rate of interst = "+rate+"%");	
		
	}
	
}
class SBI extends Bank
{
	public void rateOfInterest() 
	{
		rate=8.5;
		System.out.println("Rate of interst = "+rate+"%");	
		
	}
	public void show() 
	{
		System.out.println("IFSC NO : 154789E");
	}

}
class HDFC extends Bank
{
	

	public void rateOfInterest() 
	{ 
		rate=9.2;
		System.out.println("Rate of interst = "+rate+"%");	
		
	}}

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b= new SBI();
		b.rateOfInterest();
		
		b=new HDFC();
		b.rateOfInterest();
		
		SBI s = new SBI ();
	    s.rateOfInterest();
        s.show();
	}

}
