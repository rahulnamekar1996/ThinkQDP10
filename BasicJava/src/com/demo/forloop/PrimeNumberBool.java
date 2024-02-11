package com.demo.forloop;

import java.util.Scanner;

public class PrimeNumberBool {

	public static void main(String[] args) {
		
		  int i;
		  int num;
		  boolean flag=false;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Number");
		  num=sc.nextInt();
		  if(num==1||num==0) 
		  
		  {
			  System.out.println(num+"is not prime number");
		  }
		  else {
		  for(i=1;i<=num/2;i++) 
		  {
			  if(i%num==0)
			  
			  {
				  flag=true;
				  break;
			  }
		  }
		  }
		  if(flag==false)
		  {
			  System.out.println(num+" is prime");
		  }
		  else 
		  {
			  System.out.println(num+"is not prime");
		  }
	}

}
