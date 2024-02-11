package com.oops.objectclass;

import java.util.Scanner;

public class TestRactangle {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter first number");
		num2=sc.nextInt();
		
		Rectangle r1=new Rectangle();
		
         r1.setValues(num1,num2 );
         r1.displayResult();
	}

}
