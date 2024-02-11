package com.assingnment.for_whileloop;

import java.util.Scanner;

public class FindPower {

	public static void main(String[] args) {
		int i, num,exponent;
	      long power=1;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter base");
	      num=sc.nextInt();
	      System.out.println("Enter index");
	      exponent=sc.nextInt();
	      
	      for(i=1;i<=exponent;i++) 
	      {
	    	  power=power*num;
	      }
	      
	      System.out.println(num+" of power "+exponent+" is equal to "+power);
	      

	}

}
