package com.assignment.switchstatement;
import java.util.Scanner;
public class EvenorOdd
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int num ;
		System.out.printf("Enter the Number : ");
		num = sc.nextInt();
		int rem= num %2;
		switch (rem)
		{
			case 0:
				System.out.printf("This is a Even Number");
				break;
 
			case 1:
				System.out.printf("This is a Odd Number");
				break;
		}

	}

}
