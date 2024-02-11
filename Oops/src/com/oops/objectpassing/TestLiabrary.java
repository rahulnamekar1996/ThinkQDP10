package com.oops.objectpassing;
import java .util.Scanner;
public class TestLiabrary {
	
	static Scanner sc=new Scanner(System.in);
	public static void enterBookDetails(Library l) 
	{
		System.out.println("Enter Book Id");
		l.setId(sc.nextInt());
		System.out.println("Enter Book Name");
		l.setName(sc.next());
		System.out.println("Enter book price");
		l.setCost(sc.nextDouble());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library l1=new Library();
		enterBookDetails(l1);
		System.out.println(l1);
		Library l2=new Library();
		enterBookDetails(l2);
		System.out.println(l2);
		Library l3=new Library();
		enterBookDetails(l3);
		System.out.println(l3);



	}

}
