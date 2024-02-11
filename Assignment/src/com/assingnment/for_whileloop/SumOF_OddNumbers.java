package com.assingnment.for_whileloop;

import java.util.Scanner;

public class SumOF_OddNumbers {

	public static void main(String[] args) {
		
		int i,num,sum=0;
	      Scanner sc=new Scanner (System.in);
	      System.out.println("Enter number");
	      num=sc.nextInt();
	      
	      for(i=1;i<=num;i+=2) 
	      {
	    	  
	    	  System.out.println(i);
	    	  sum=sum+i;
	    	  
	    	 
	      }
	      System.out.println("SUM of ALL odd NUMBERS ARE= "+sum);

	}

}
