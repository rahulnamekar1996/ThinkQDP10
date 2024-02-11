package com.demo.whileloop;

import java.util.Scanner;

public class FactorialNmumber {

	public static void main(String[] args) {
		long fact=1;
		int num;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++)
		{
			
			fact=fact*i;
		}
		System.out.println("factorial is="+fact);
             

	}

}
