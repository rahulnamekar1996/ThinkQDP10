package com.oops.objectpassing;
import java.util.Scanner;
public class TestBook {
	
	static Scanner sc =new Scanner(System.in);
	public static void enterBookDetails(Book b) 
	{
		System.out.println("Enter Book Id");
		b.setBid(sc.nextInt());
		System.out.println("Enter Book Name");
		b.setBname(sc.next());
		System.out.println("Enter Book Price");
		b.setBprice(sc.nextDouble());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1=new Book ();
		enterBookDetails(b1);
		Book b2 =new Book ();
		enterBookDetails(b2);
		Book b3 =new Book();
		enterBookDetails(b3);
		Book b4=new Book ();
		enterBookDetails(b4);
		
		System.out.println(b1);
		System.out.println(" Discounted amount "+ b1.calDisc(15));
		System.out.println(b2);
		System.out.println(" Discounted amount "+ b2.calDisc(12));
		System.out.println(b3);
		System.out.println(" Discounted Amount "+ b3.calDisc(10));
		System.out.println(b4);
		System.out.println("Discounted amount "+ b4.calDisc(16));
		
		b1.compareDisc(b2);

	}

}
