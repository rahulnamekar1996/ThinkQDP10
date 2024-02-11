package com.demo.whileloop;
import java .util.Scanner;
public class PrimeNumberBool {

	public static void main(String[] args) {
		

		  int i=1;
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
		  while(i<=num/2) 
		  {
			  
			  if(i%num==0)
			  
			  {
				  
				  
				  flag=true;
				  break;
				  
			  }
			  i++;
			 
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
