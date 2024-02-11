package com.assignment.switchstatement;
import java.util.Scanner;
public class SwichStatementAssignment 
{

	public static void main(String[] args)
	{
		//1. JAVA PROGRAM TO PRINT TOTAL NO.OF DAYS IN MONTH USING SWITCH CASE
		
		Scanner sc = new Scanner(System.in);
		int mon = 0;
	
		System.out.printf("Enter the Month Number : ");
		mon = sc.nextInt();
		switch(mon)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.print("Number of Days 31..");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print("Number of Days 30..");
				break;
			case 2:
				System.out.println("Number of days 28..");
				break;
			default:
				System.out.printf("Invalid month number");
		}
		
		
	 
		
	

	}

}
