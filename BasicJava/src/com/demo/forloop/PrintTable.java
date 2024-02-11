package com.demo.forloop;

import java.util.Scanner;

import java .util.Scanner;
public class PrintTable {

	public static void main(String[] args)
	{
		int i;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		System.out.println("Table of"+" "+num);
		for(i=1;i<=10;i++)
		{
	
			System.out.println(num+"*"+i+"="+num*i);
		}
		
		
		

	}

}
