package com.demo.whileloop;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		num=sc.nextInt();
		int rem;
		
		int rev=0;
		
		int n=num;
		while(num!=0) {
		rem= num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		if (rev==n) 
		{
			System.out.println("palindrome");
		
		}
		else 
		{
		 System.out.println("not palindrome");	
		}
		
	}

}
