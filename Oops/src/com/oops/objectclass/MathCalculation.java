package com.oops.objectclass;

import java.util.Scanner;

class MathCal
{
	public void showResult(int a ,int b) 
	{
		System.out.println("Addition ="+(a+b));
		System.out.println("Subtraction ="+(a-b));
		System.out.println("Multiplication ="+(a*b));
		System.out.println("Division ="+(a/b));
	}
}

public class MathCalculation {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        num1=sc.nextInt();
        System.out.println("Enter second  number");
        num2=sc.nextInt();
		MathCal m1= new MathCal();
		m1.showResult(num1,num2);
		
	}

}
