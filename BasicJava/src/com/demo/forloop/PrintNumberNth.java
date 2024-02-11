package com.demo.forloop;
import java.util.Scanner;
public class PrintNumberNth {

	public static void main(String[] args) 
	{
		int i;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
	
		
	
		
		if(n>0) {
		for(i=1;i<=n;i++) 
		{
			System.out.println(i);
		}
		}
		else {
			System.out.println("Inavald number");
		}

	}

}
