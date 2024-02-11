package com.oops.objectclass;

public class BookTest {

	public static void main(String[] args) {
		
		Book b1=new Book();
		Book b2=new Book();
		Book b3=new Book();
		
		b1.setDetails(1,"chhava" , 250);
		b2.setDetails(2,"  pilot" , 350);
		b3.setDetails(3," vijeta " , 250);
		
		b1.showDetails();
		b2.showDetails();
		b3.showDetails();
	}

}
