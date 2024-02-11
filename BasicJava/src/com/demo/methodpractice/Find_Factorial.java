package com.demo.methodpractice;
import java .util.Scanner;
public class Find_Factorial {
	public static int findFact(int n) {
		int i;
		int fact=1;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	public static void printFactorial(int n) {
		int i;
		for(i=1;i<=n;i++) {
			System.out.println(i+"!="+findFact(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int num=sc.nextInt();
	int fact=findFact(num);
	System.out.println(num+"!="+fact);
		
		printFactorial(10);
	}

}
