package com.demo.whileloop;
import java.util.Scanner;
public class CountDigit {

	public static void main(String[] args) 
	{
		int num,count=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		while(num!=0)
		{
			num=num/10;
			count++;
			
		}
		System.out.println("Total nummber of digits= "+count);
	}

}
