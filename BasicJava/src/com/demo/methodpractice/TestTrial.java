package com.demo.methodpractice;
import java .util.Scanner;
public class TestTrial {
	public static double showBill(int quantity)
	
	{
		double totalbill=0;
		if(quantity>0) {
			
		if(quantity>=50) 
			totalbill=quantity*100;
		else if(quantity<50 && quantity>=30)
			totalbill=quantity*125;
		else
			totalbill= quantity*140;
		}
		else
			System.out.println("Invalid input");
		
		return totalbill;
		
		
	}
	public static void main(String[] args) 
	
	{
		
		int quantity;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter quantity");
		quantity=sc.nextInt();
		
		double bill= showBill(quantity);
		System.out.println(  "Total bill pay ="+bill);
	}

}
