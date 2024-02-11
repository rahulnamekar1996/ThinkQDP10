package com.demo.mehod;
import java.util.Scanner;
public class FindFcatorial
{
	
	static long showFactorial(int num) 
	
	{
		int i;long fact=1;
		for(i=1; i<=num; i++) 
		{
			fact=fact*i;
		}
		
	  return fact;
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter number");
		int num=sc.nextInt();
        long result= showFactorial(num);
         System.out.println("factorial is ="+result);
	}

}
