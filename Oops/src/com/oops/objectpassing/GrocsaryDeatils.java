package com.oops.objectpassing;
import java.util.Scanner;
public class GrocsaryDeatils {
	static Scanner sc =new Scanner(System.in);
	
	public static void entersItemDetails(Item i) 
	{
		System.out.println("Enter item id");
		i.setItemid(sc.nextInt());
		System.out.println("Enter item name");
		i.setIname(sc.next());
		System.out.println("Enter item cost");
		i.setPrice(sc.nextDouble());
		System.out.println("Enter Item qty");
		i.setQty(sc.nextInt());
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item i1= new Item();
		entersItemDetails(i1);
		
		Item i2=new Item();
		entersItemDetails(i2);
		
		System.out.println("---------");
		System.out.println(i1);
		System.out.println("Amount to pay = "+i1.calDisc(10));
		System.out.println(i2);
		System.out.println("Amount to pay = "+i2.calDisc(15));
		
		i1.compareCost(i2);
	}

}
