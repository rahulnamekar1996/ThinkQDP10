package com.assignment.jan4;

import java.util.Scanner;

public class SumOfOddEvenNatural {
	
	public static void showResult(int num)
	{
		int i,evenSum=0,oddSum=0,naturalSum=0;
		
		for(i=1;i<=num;i++) 
		{
			naturalSum=naturalSum+i;
			
			if(i%2==0)
			{
				evenSum=evenSum+i;
				
			}
			else
			{
				oddSum=oddSum+i;
				
			}
			
		}
		System.out.println("Sum of natural numbers are ="+naturalSum);
		System.out.println("Sum of Even numbers are ="+evenSum);
		System.out.println("Sum of odd nummber is ="+oddSum);
	}

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		
	showResult(num);
		
        
	}

}
