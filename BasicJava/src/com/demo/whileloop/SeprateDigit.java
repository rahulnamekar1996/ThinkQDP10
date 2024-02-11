package com.demo.whileloop;

import java.util.Scanner;


public class SeprateDigit {

	public static void main(String[] args)
	{
	  int num,rem;
	  Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number");
	  num=sc.nextInt();
	  
	  while(num!=0) 
	  {
		  rem=num%10;
		  num=num/10;
		  
		  System.out.println(rem+"NEXT NUMBER"+num);
				  
	  }

	}

}
