package com.oops.objectclass;

public class Book {
	
	int bookid;
	String bookname;
	double bookprice;

	
	public void setDetails(int bid,String bname,double bprice)
	{
		bookid=bid;
		bookname=bname;
		bookprice= bprice;
	}
	public void showDetails() 
	{
		System.out.println(" Book id ="+ bookid);
		System.out.println(" Book Name ="+ bookname);
		System.out.println(" Book price =" + bookprice);
		System.out.println("--------------------------");
				
	}
}
