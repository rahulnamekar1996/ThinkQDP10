package com.assignment.labsession;
import java.util.Scanner;
public class BillPyment {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int qty;
		float unitprice=50;
		double total=0, paybill=0;
		System.out.println("Enter quantity");
		qty=sc.nextInt();
		total=qty*unitprice;
		if(qty<=10)
		{
			System.out.println("No discount");
			paybill=total;
			
		}
		else if(qty<=25)
		{
			System.out.println("5% Disscount");
			paybill=total-(0.05*total);
		}
		else if(qty<=50)
		{
			System.out.println("10 % disscount");
			paybill=total-(0.1*total);
		}
		else
		{
			System.out.println("20 % Disccount");
			paybill=total-(0.2*total);
		}
		System.out.println("total price "+total);
		System.out.println("Bill Payment"+ paybill);
		
		
		
		

	}

}
