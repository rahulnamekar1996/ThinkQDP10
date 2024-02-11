package com.demo.whileloop;
import java.util.Scanner;
public class FindFactors {

	public static void main(String[] args)
	{
		
		int i=2,num;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num= sc.nextInt();
	    System.out.println("Factors of "+num);
	    
	    while(i<=num) 
	    {
	    	if(num%i==0) 
	    	{
	    	
	    		
	    		
	    		System.out.println(i);
	    	
	    		count++;
	    		
	    		
	    	}
	    	i++;
	    }
	    System.out.println("Total Number of "+count);
	    if(count==1 )
		 {
			 System.out.println("Number is prime");
		 }
		 else 
		 {
			 System.out.println("Number is not prime");
		 }

	}

}
