 package com.assingnment.for_whileloop;
import java .util.Scanner;
public class CountNumberOfDigits {

	public static void main(String[] args)
	{
		int num ,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		while(num>0) 
		{
			num=num/10;
			count++;
		}
       System.out.println("Total no of digit= "+count);

	}

}
