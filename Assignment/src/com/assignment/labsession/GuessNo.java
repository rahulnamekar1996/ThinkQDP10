package com.assignment.labsession;
import java .util.Scanner;
public class GuessNo
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 42;
		int user ,i;
		int count = 0;
		System.out.println("Guess the number : ");
		user =sc.nextInt();
		for(;;)
		{ 	count++;
			if(n<user)
			{
				System.out.println("Number is less than your assumption");
			}
			else if(n>user)
			{
				System.out.println("Number is greater than your assumption");
			}
			else if(n==user)
			{
				System.out.println("Congratulation ! You guessed it correct");
			
				System.out.println("You guessed it in "+count+ " times");
				break;
			}
			System.out.println("Guess the number : ");
			user =sc.nextInt();
			
			
		}
		

	}

}
