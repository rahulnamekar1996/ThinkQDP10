package com.demo.whileloop;
import java.util.Scanner;
public class AddNumbers {

	public static void main(String[] args) 
	{
		int n ,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		
		
		for(;;) 
		{
			if(n>0)
			{
			sum=sum+n;
			
			
			}
			if(sum==100)
			{
				break;
			}
		}
		System.out.println(sum);

		System.out.println(" Enter number");
		n=sc.nextInt();
		if(n<0) 
		{
			System.out.println("Only input possitive nomber");
		}
	}

}
