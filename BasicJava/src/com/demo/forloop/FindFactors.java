package com.demo.forloop;
import java.util.Scanner;
public class FindFactors {

	public static void main(String[] args) 
	{
		int i;
		int num;
		int count=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number");
		 num=sc.nextInt();
		 System.out.println("Factors of "+num);
		 
		 for(i=2;i<=num/2;i++)
		 {
			 if(num%i==0)
			 {
				 count++;
				 System.out.println(i);
				 
				 
			 }
			 
			
		 }
		if(count==0 )
		 {
			 System.out.println("Number is prime");
		 }
		 else 
		 {
			 System.out.println("Number is not prime");
		 }
		 
		 

	}

}
