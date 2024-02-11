package com.oops.objectclass;

public class Food {
	
	int foodid;
	String foodname;
	double foodprice;
	
//	public void setDetaials(int fid,String fname,double fprice)
//	{
//		foodid=fid;
//		foodname=fname;
//		foodprice=fprice;
//		
//	}
	
	//using this keyword assigning loacal variable to instance variable.
	public void setDetaials(int foodid,String foodname,double foodprice)
	{
		this.foodid=foodid;
		this.foodname=foodname;
		this.foodprice=foodprice;
		
	}
	public void showDetails()
	{
		System.out.println("food id = "+ foodid);
		System.out.println("food name = "+ foodname);
		System.out.println("food id = "+ foodprice);
	}
	

}
