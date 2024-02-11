package com.demo.methodpractice;
import java.util.Scanner;
public class AddNumbers {
	
	public static int showSum (int a,int b,int c)
	{
	    int sum=a+b+c;
	    
	   return sum;
		
	}

	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number");
//		int a= sc.nextInt();
//		int b =sc.nextInt();
//		int c= sc.nextInt();
	    int result= showSum(50,20,20);
	    if(result>100) 
	    {
	    	System.out.println(result+" =hello");
	    	
	    }
	    else 
	    {
	    	System.out.println(result+" =hii");
	    }

	}

}
