package com.demo.whileloop;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
	
		
		int num,rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		
			
	
		}
		System.out.println("Sum= "+sum);
		

	}

}
