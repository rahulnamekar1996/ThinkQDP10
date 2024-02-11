package com.oops.objectpassing;

public class Book {
	
	private int bid;
	private String bname;
	private double bprice,discprice;
	private String category;
	private double discount;
	
	Book()
	{
		
	}
	Book(int bid ,String bname,double price)
	{
		this. bid=bid;
		 this.bname =bname;
		 this.bprice=bprice;
		
		
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
	public double getDisc() {
		return discprice;
	}
	public void setDisc(double disc) {
		this.discprice = disc;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double calDisc(double discount) 
	{
		this.discount=discount;
		discprice = ((discount /100)*bprice);
		return discprice;
	}
	public String toString() 
	{
		return "Book Id = "+bid +" "+"Book name = "+bname +" "+" book price = "+bprice;
	}
	public void compareDisc(Book b2) 
	{
		if(this.discount==b2.discount) 
		{
			System.out.println("both have same discount");
			
		}
		else if(this.discount>b2.discount)
		{
			System.out.println(this.bname+" has greater discount than "+b2.bname);
		}
		else 
		{
			System.out.println(b2.bname+" Has greater discount");
		}
	}
	

}
