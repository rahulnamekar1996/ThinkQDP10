package com.assignment.labsession;
import java.util.Scanner;
public class FibonanciSeries
{

	public static void main(String[] args) 
	{

		int n1=0,n2=1,n3;
		int i,num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter series");
		
		num=sc.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		for(i=2;i<num;i++) 
		{
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
			
		}
		
	}

}
