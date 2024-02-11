package com.assingnment.constructor;

import java.util.Scanner;

public class TestHarshad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		HarshadNo h=new HarshadNo(num);
		if(h.checkHarshad()) 
		{
			System.out.println(num+ " is harshad number");
		}
		else 
		{
			System.out.println(num+ " is not harshad number");
		}
		

	}

}
