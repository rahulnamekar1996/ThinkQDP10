package com.assignment.abstarctandinterface;

abstract class IncomeTax
{
	private double itax;

	public IncomeTax()
	{
		
	}
	private IncomeTax(double itax) 
	{
		this.itax=itax;
	}
	public double getItax() {
		return itax;
	}
	public void setItax(double itax) {
		this.itax = itax;
	}
	abstract void payTax();
}

class GovernmentJobItax extends IncomeTax
{

	@Override
	void payTax() {
       System.out.println("IncomeTax is 0 % for government jab");
		
	}
	
}
class PrivateJobItax extends IncomeTax


{

	@Override
	void payTax() {
		System.out.println("Income tax for private jab is 3 %"); 
		
	}
	
}
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
