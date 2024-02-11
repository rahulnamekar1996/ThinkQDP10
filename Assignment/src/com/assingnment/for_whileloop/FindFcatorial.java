package com.assingnment.for_whileloop;
import java .util.Scanner;
public class FindFcatorial {

	public static void main(String[] args) {
		
		 int num,fact=1 ;  //just taking n=5 
		  int sum = 0; 
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter number");
		  num=sc.nextInt();
		  for(int i=1;i<=num;i++) { 
			  fact=fact*i;
		      sum = sum + fact ; 
		   } 
		   System.out.println("Sum is "+sum); 
		  
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
