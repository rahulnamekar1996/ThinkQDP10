package com.oops.objectpassing;

public class Item {
	private int itemid;
	

	private String iname;
	private double disc;
	private double price;
	private int qty;
	Item()
	{
		
	}
	Item(int itemid, String iname,double price ,int qty)
	{
		this.itemid=itemid;
		this.iname=iname;
		this.price=price;
		this.qty=qty;
	}
	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public double getDisc() {
		return disc;
	}

	public void setDisc(double disc) {
		this.disc = disc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	public double calTotal() 
	{
		double totalprice =qty*price;
		return totalprice;
	}
	public double calDisc(double disc) 
	{
		double total =calTotal();
		disc= total -((disc/100)*total);
		return disc;
	}
	
	public String toString() 
	{
		return "item name = "+iname+" "+"item id = "+ itemid +" "+"Item qty = "+ qty +" "+" Item price ="+price+" "+" Total"+calTotal();
	}
	public void compareCost(Item i1) 
	{
		if(this.disc==i1.disc) 
		{
			System.out.println("Both have same cost");
		}
		else if(this.disc>i1.disc) 
		{
			System.out.println(this.getIname()+" is higher cost "+i1.getIname());
		}
		else 
		{
			System.out.println(i1.getIname()+" is higher cost ");
		}
	}

}
