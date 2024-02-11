package com.demo.forloop;
import java .util.Scanner;
public class FindPower {

	public static void main(String[] args) 
	{
      int i, num,exponent;
      long power=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      num=sc.nextInt();
      System.out.println("Enter power");
      exponent=sc.nextInt();
      
      for(i=1;i<=exponent;i++) 
      {
    	  power=power*num;
      }
      
      System.out.println(num+" of power "+exponent+" is equal to "+power);
      
      

	}

}
