package com.assingnment.for_whileloop;

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {

		int num ,rem, prod=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		while(num>0) 
		{
			rem=num%10;
			prod=prod*rem;
			num=num/10;
		
		}
       System.out.println("Total product = "+prod);

	}

}
