package com.assignment.labsession;
import java.util.Scanner;
public class PrintSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n ,sum=0;
		System.out.println("Enter numbers : ");
		n = sc.nextInt();
		
		
		for(;;)
		{
			
			if(n>=0)
			{
				sum = sum + n;
				
			}
			if(sum >=100)
			{
				break;
			}
			
			
			System.out.println("Enter next numbers : ");
			n = sc.nextInt();
			if (n<0)
				
			{
				System.out.println("Enter positve numbers only");
			}
			
		}
		System.out.println("sum = "+sum);
		
	
	}
}
