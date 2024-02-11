package com.oops.constructor;

public class Customer {

	private int  custid;
	private String custname;
	private long contactNo;
	private String custemail;
	
	public Customer() 
	{
		
	}
	public Customer(String custemail,String custname,long contactNo) 
	{
		this.custemail=custemail;
		this.custname=custname;
		this.contactNo=contactNo;
	}
	public Customer(int custid,String custname,long contactNo ) 
	{
		this.contactNo=contactNo;
		this.custid=custid;
		this.custname=custname;
	}
	public Customer(int custid)
	{
		this.custid=custid;
	}
	
	
	
}
