package com.demo.whileloop;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=30)
		{
			if(i%2==0) 
			{
				sum=sum+i;
				
			}
			
			i++;
		}
		System.out.println("Sum of Even Number is="+sum);


	}

}
