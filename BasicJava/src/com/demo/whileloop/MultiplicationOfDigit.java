package com.demo.whileloop;
import java .util.Scanner;
public class MultiplicationOfDigit {

	public static void main(String[] args)
	{
	   int num,rem,mul=1;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter any number");
	   num=sc.nextInt();
	   while(num!=0) 
	   {
		   rem=num%10;
		   mul=mul*rem;
		   num=num/10;
		   
	   }
	   System.out.println("multiplication= "+mul);

	}

}
