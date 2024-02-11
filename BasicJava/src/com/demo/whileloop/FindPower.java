package com.demo.whileloop;
import java.util.Scanner;
public class FindPower 
{

	public static void main(String[] args) 
	{
		 int i=1, num,exponent;
	      long power=1;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter number");
	      num=sc.nextInt();
	      System.out.println("Enter power");
	      exponent=sc.nextInt();
	      
	      while(i<=exponent) 
	      {
	    	  power=power*num;
	    	  i++;
	      }
	      
	      
	      System.out.println(num+" of power "+exponent+" is equal to "+power);
	      
	      
	}
	

}
