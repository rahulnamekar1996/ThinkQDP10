package com.oops.constructor;

public class Book {
	
	private int bid;
	private String bname;
	private double bprice;
	
	public Book() 
	{
		
		
	}
	public Book (int bid ,String bname,double bprice)
	{
		this.bid=bid;
		this.bname=bname;
		this .bprice=bprice;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getBprice() {
		return bprice;
	}
	public void setBprice(double bprice) {
		this.bprice = bprice;
	}
	
	public String toString () 
	{
		return "Book Id = "+ bid;
       
						
        
        
       
	}

}
