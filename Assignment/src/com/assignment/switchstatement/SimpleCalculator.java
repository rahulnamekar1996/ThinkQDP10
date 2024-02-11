package com.assignment.switchstatement;
import java.util.Scanner;
public class SimpleCalculator 
{

	public static void main(String[] args)
	
	
	{
		Scanner sc = new Scanner(System.in);
	
    System.out.println("Enter value of 1st number ::");
    int a = sc.nextInt();

    System.out.println("Enter value of 2nd number ::");
    int b = sc.nextInt();

    System.out.println("Select operation");
    System.out.println("1.Addition\n2.Subtraction\n3. Multiplication\n4. Division-d: ");
    int choice = sc.nextInt();
    switch(choice) {
       case 1 :
       System.out.println("Sum of the given two numbers: "+(a+b));
       break;
       case 2 :
       System.out.println("Subtraction between the two numbers: "+(a-b));
       break;
       case 3 :
       System.out.println("Multiplication of the two numbers: "+(a*b));
       case 4 :
       System.out.println("Result of the division: "+(a/b));
       break;
       default :
       System.out.println("Invalid grade");
	
     }
	}

}
