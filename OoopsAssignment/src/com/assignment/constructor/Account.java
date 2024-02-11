package com.assignment.constructor;

public class Account {
	
	public long acc_no=12121415;
	public String custName="Tanmay shukla";
	
	public Account()
	{
		System.out.println(" Account no "+acc_no);
		System.out.println("Customer name = "+custName);
		System.out.println("I am default Constructor");
	}
	public Account(long acc_no,String custName) 
	{
		this.acc_no=acc_no;
		this.custName=custName;
		System.out.println("I am parameterized constructor");
	}
	
	
	
	

}
