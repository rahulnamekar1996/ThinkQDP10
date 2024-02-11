package com.assingnment.constructor;
import java.util.Scanner;
public class TestArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter numbe");
		num =sc.nextInt();
		Armstrong a=new Armstrong(num);
		if(a.checkArmstrong()) 
		{
			System.out.println(num +"  is Armstrong");
			
		}
		else 
		{
			System.out.println(num +"Number is Not Armstrong");
		}
		

	}

}
