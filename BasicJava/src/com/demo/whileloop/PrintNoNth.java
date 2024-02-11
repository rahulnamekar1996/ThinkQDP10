package com.demo.whileloop;

import java.util.Scanner;

public class PrintNoNth {

	public static void main(String[] args) {
		int i=1;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
	
		
	
		
		if(n>0) {
		while(i<=n) 
		{
			System.out.println(i);
			i++;
		}
		
		}
		
	}

}
